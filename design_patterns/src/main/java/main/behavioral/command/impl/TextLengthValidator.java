package main.behavioral.command.impl;

import main.behavioral.command.Validator;

import java.util.Arrays;

public class TextLengthValidator implements Validator<String> {
    private final int minSize;
    private final int maxSize;

    public TextLengthValidator(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    @Override
    public boolean isValid(String... types) {
        return Arrays.stream(types).allMatch(t -> isBetween(t.length()));
    }

    private boolean isBetween(int value) {
        return ((value > this.minSize) && (value < this.maxSize));
    }
}
