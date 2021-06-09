package main.behavioral.command.impl;

import main.behavioral.command.Validator;

import java.util.Arrays;

public class NonZeroValidator implements Validator<Number> {

    @Override
    public boolean isValid(Number... types) {
        return Arrays.stream(types).allMatch(o -> o.doubleValue() != 0);
    }
}
