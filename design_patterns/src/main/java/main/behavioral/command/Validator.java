package main.behavioral.command;

public interface Validator<T> {

    boolean isValid(T... types);
}
