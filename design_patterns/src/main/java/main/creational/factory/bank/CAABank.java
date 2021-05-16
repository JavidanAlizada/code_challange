package main.creational.factory.bank;

import main.creational.factory.process.credit.CAABankCreditProcess;
import main.creational.factory.process.deposit.CAABankDepositProcess;

public class CAABank extends Bank {
    private final String name;
    private final CAABankCreditProcess creditProcess;
    private final CAABankDepositProcess depositProcess;

    public CAABank() {
        this.creditProcess = new CAABankCreditProcess();
        this.depositProcess = new CAABankDepositProcess();
        this.name = "CAABank";
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
