package main.behavioral.chain_of_responsibility.model.submodel;

import main.behavioral.chain_of_responsibility.constant.Operations;
import main.behavioral.chain_of_responsibility.model.BankEmployee;

public class CreditBranchManager extends BankEmployee {

    public CreditBranchManager() {
        super(Operations.BUSINESS_CREDIT);
    }

    @Override
    public void process(Operations operations) {
        if (!isValidResponsibilityForGivenOperation(operations)) {
            this.getHighPrivilegedBankEmployee().process(operations);
            System.out.println("Operation forwarded by " + getClass().getSimpleName());
            return;
        }
        System.out.println("Operation processed by " + getClass().getSimpleName());
    }
}
