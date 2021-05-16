package main.creational.factory.bank;

import main.creational.factory.process.credit.AAABankCreditProcess;
import main.creational.factory.process.deposit.AAABankDepositProcess;

public class AAABank extends Bank {
    private final String name;
    private final AAABankCreditProcess creditProcess;
    private final AAABankDepositProcess depositProcess;

    public AAABank() {
        this.creditProcess = new AAABankCreditProcess();
        this.depositProcess = new AAABankDepositProcess();
        this.name = "AAABank";
    }

    @Override
    public void bankOperation() {
        creditProcess.credit();
        depositProcess.deposit();
    }

    @Override
    public String getName() {
        return this.name;
    }


}
