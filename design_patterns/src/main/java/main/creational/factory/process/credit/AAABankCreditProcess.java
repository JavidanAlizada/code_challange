package main.creational.factory.process.credit;

import main.creational.factory.process.CreditProcess;

public class AAABankCreditProcess implements CreditProcess {

    @Override
    public void credit() {
        System.out.println("AAABank has credit operation");
    }
}
