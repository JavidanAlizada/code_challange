package main.extra.second;

public abstract class CustomType implements Convertable{

    private String name;

    public CustomType(String name) {
        this.name = name;
        System.out.println("Type is : " + getClass().getSimpleName());
    }

    public String getTypeName(){
        return this.name;
    }
}
