package main.structural.facade.orm;

public class OrmFacadeImplementation {

    private final DatabaseConnector databaseConnector;
    private final FileHandler fileHandler;
    private final Mapper mapper;
    private final PojoObjectHandler pojoObjectHandler;
    private String fileName;
    private String content;
    private String pojoObjectName;
    private String databaseName;
    private String tableName;

    public OrmFacadeImplementation(String fileName, String content, String pojoObjectName, String databaseName,
                                   String tableName) {
        this.fileName = fileName;
        this.content = content;
        this.pojoObjectName = pojoObjectName;
        this.databaseName = databaseName;
        this.tableName = tableName;
        this.databaseConnector = new DatabaseConnector();
        this.fileHandler = new FileHandler();
        this.mapper = new Mapper();
        this.pojoObjectHandler = new PojoObjectHandler();
    }

    public void mapFileContentToDatabaseTable() {
        this.fileHandler.setFilename(fileName);
        this.fileHandler.setContent(content);
        this.fileHandler.readFromFile();
        this.pojoObjectHandler.setPojoObjectName(pojoObjectName);
        this.pojoObjectHandler.deserializeFileToPojoObject();
        this.databaseConnector.setDatabaseName(databaseName);
        this.databaseConnector.setTableName(tableName);
        this.databaseConnector.connectToDatabase();
        this.databaseConnector.findTableOnDatabase();
        this.mapper.setDatabaseName(databaseName);
        this.mapper.setPojoObject(pojoObjectName);
        this.mapper.setTableName(tableName);
        this.mapper.mapPojoToTable();
        this.databaseConnector.disconnect();
    }

    public void mapTableFromDatabaseToFile() {
        this.databaseConnector.setDatabaseName(databaseName);
        this.databaseConnector.setTableName(tableName);
        this.databaseConnector.connectToDatabase();
        this.databaseConnector.findTableOnDatabase();
        this.mapper.setDatabaseName(databaseName);
        this.mapper.setPojoObject(pojoObjectName);
        this.mapper.setTableName(tableName);
        this.mapper.mapTableToPojo();
        this.pojoObjectHandler.setPojoObjectName(pojoObjectName);
        this.pojoObjectHandler.serializePojoObjectToFile();
        this.fileHandler.setFilename(fileName);
        this.fileHandler.setContent(content);
        this.fileHandler.writeToFile();
        this.databaseConnector.disconnect();
    }
}
