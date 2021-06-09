package main.behavioral.command;

public class ValidationController<T> {

    @SafeVarargs
    public static <T> void validate(Validator<T> validator, T... objects) {
        System.out.println(validator.isValid(objects));
    }
}
