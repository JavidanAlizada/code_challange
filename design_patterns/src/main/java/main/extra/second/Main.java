package main.extra.second;

public class Main {
    public static void main(String[] args) {
        CustomType customType = new ACustomType();
        CustomType convertedCustomTYpe = customType.convert(new BCustomType());
        System.out.println(convertedCustomTYpe.getTypeName());
    }
}
