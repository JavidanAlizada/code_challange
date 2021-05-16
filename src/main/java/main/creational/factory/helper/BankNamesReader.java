package main.creational.factory.helper;

import main.creational.factory.constant.BankNames;

import java.util.Arrays;

public class BankNamesReader {

    public static BankNames[] getBankNames() {
        return BankNames.values();
    }

    public static String getBankNamesAsString() {
        StringBuilder bankNames = new StringBuilder();
        Arrays.stream(getBankNames()).forEach(bank -> {
            bankNames.append("\n");
            bankNames.append(bank.toString());
        });
        return bankNames.toString();
    }
}
