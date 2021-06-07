package main.behavioral.model;

import main.behavioral.Processable;
import main.behavioral.ResponsibilityChecker;
import main.behavioral.constant.Operations;

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
