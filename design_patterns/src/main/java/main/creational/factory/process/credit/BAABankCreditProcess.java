package main.creational.factory.process.credit;

import main.creational.factory.process.CreditProcess;

public class BAABankCreditProcess implements CreditProcess {

    @Override
    public void credit() {
        System.out.println("BAABank has credit operation");
    }
}
