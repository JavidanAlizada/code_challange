package main.behavioral.chain_of_responsibility.model;

import main.behavioral.chain_of_responsibility.Processable;
import main.behavioral.chain_of_responsibility.ResponsibilityChecker;
import main.behavioral.chain_of_responsibility.constant.Operations;

public abstract class BankEmployee implements Processable, ResponsibilityChecker {
    protected Operations operations;
    private BankEmployee bankEmployee;

    public BankEmployee(Operations operations) {
        this.operations = operations;
    }

    public BankEmployee getHighPrivilegedBankEmployee() {
        return bankEmployee;
    }

    public void setHighPrivilegedBankEmployee(BankEmployee bankEmployee) {
        this.bankEmployee = bankEmployee;
    }

    public boolean isValidResponsibilityForGivenOperation(Operations operations) {
        return operations == this.operations;
    }
}
