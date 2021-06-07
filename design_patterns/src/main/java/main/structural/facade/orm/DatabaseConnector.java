package main.structural.facade.orm;

public class DatabaseConnector {

    private String databaseName;
    private String tableName;


    public void connectToDatabase() {
        System.out.println("Connected to  " + databaseName + "  ......");
    }


    public void disconnect() {
        System.out.println(" Connection closed from : " + databaseName + "  ......");
    }

    public void findTableOnDatabase() {
        System.out.println("Table " + tableName + " has been founded on database " + databaseName);
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
