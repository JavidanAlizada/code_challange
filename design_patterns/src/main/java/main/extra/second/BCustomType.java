package main.extra.second;

public class BCustomType extends CustomType{
    public BCustomType() {
        super("BClass");
    }

    @Override
    public CustomType convert(CustomType customType) {
        System.out.println("Converted to " + customType.getTypeName());
        return customType;
    }
}
