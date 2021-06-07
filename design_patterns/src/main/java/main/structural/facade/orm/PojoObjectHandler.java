package main.structural.facade.orm;

public class PojoObjectHandler {
    private String pojoObjectName;



    public void deserializeFileToPojoObject(){
        System.out.println("Content from file mapped to Pojo Object: "+ pojoObjectName);
    }
    public void serializePojoObjectToFile(){
        System.out.println("Content from Pojo Object:"+ pojoObjectName+"  mapped to file");
    }

    public void setPojoObjectName(String pojoObjectName) {
        this.pojoObjectName = pojoObjectName;
    }
}
