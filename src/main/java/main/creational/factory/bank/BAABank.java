package main.creational.factory.bank;

import main.creational.factory.process.credit.BAABankCreditProcess;
import main.creational.factory.process.deposit.BAABankDepositProcess;

public class BAABank extends Bank {
    private final String name;
    private final BAABankCreditProcess creditProcess;
    private final BAABankDepositProcess depositProcess;

    public BAABank() {
        this.creditProcess = new BAABankCreditProcess();
        this.depositProcess = new BAABankDepositProcess();
        this.name = "BAABank";
    }

    @Override
    protected void bankOperation() {
        creditProcess.credit();
        depositProcess.deposit();
    }

    @Override
    protected String getName() {
        return this.name;
    }
}
