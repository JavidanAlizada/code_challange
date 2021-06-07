package main.extra.second;

public class ACustomType extends CustomType {
    public ACustomType() {
        super("AClass");
    }

    @Override
    public CustomType convert(CustomType customType) {
        System.out.println("Converted to " + customType.getTypeName());
        return customType;
    }
}
