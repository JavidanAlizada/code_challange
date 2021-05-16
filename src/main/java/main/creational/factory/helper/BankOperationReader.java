package main.creational.factory.helper;

import main.creational.factory.constant.Operation;

import java.util.Arrays;

public class BankOperationReader {

    public static Operation[] getOperations() {
        return Operation.values();
    }

    public static String getOperationsAsString() {
        StringBuilder operations = new StringBuilder();
        Arrays.stream(getOperations()).forEach(operation -> {
            operations.append("\n");
            operations.append(operation.toString());
        });
        return operations.toString();
    }
}
