package main.structural.facade.orm;

public class Mapper {
    private String tableName;
    private String databaseName;
    private String pojoObject;


    public void mapPojoToTable() {
        System.out.println("" + pojoObject + " mapped to " + tableName + " on " + databaseName);
    }

    public void mapTableToPojo() {
        System.out.println("" + tableName + " on " + databaseName + " mapped to " + pojoObject);
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setPojoObject(String pojoObject) {
        this.pojoObject = pojoObject;
    }
}
