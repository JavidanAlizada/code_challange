package main.behavioral.command.impl;

import main.behavioral.command.Validator;

import java.util.Arrays;

public class AgeValidator implements Validator<Integer> {
    private final int minAge;
    private final int maxAge;

    public AgeValidator(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Override
    public boolean isValid(Integer... types) {
        return Arrays.stream(types).allMatch(this::isBetween);
    }

    private boolean isBetween(int value) {
        return ((value > this.minAge) && (value < this.maxAge));
    }
}
