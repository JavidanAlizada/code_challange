package main.structural.facade;

import main.structural.facade.orm.OrmFacadeImplementation;

public class Main {

    private static String fileName = "person.json";
    private static String content = "{person: {name: Javidan, surname: Alizada, age: 21}, position:developer}";
    private static String pojo = "Person";
    private static String database = "custom_db";
    private static String table = "person";

    public static void main(String[] args) {
        /*
         *  file reading | file writing
         *  deserialized and convert to POJO object | serialized and convert to file
         *  connect to database
         *  map POJO object to related table on database
         * */

        OrmFacadeImplementation orm = new OrmFacadeImplementation(fileName, content, pojo, database, table);
        System.out.println("\nStart Mapping file content to table !!!");
        orm.mapFileContentToDatabaseTable();
        System.out.println("\nStart Mapping content from table to file !!!");
        orm.mapTableFromDatabaseToFile();
    }
}
