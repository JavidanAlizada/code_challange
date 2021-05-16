package main.creational.factory.process.credit;

import main.creational.factory.process.CreditProcess;

public class CAABankCreditProcess implements CreditProcess {

    @Override
    public void credit() {
        System.out.println("CAABank has credit operation");
    }
}
