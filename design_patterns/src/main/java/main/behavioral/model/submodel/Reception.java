package main.behavioral.model.submodel;

import main.behavioral.constant.Operations;
import main.behavioral.model.BankEmployee;

public class Reception extends BankEmployee {


    public Reception() {
        super(Operations.SIMPLE_REQUEST_OR_FORWARDING);
    }

    @Override
    public void process(Operations operations) {
        if (!isValidResponsibilityForGivenOperation(operations)){
            this.getHighPrivilegedBankEmployee().process(operations);
            System.out.println("Operation forwarded by " + getClass().getSimpleName());
            return;
        }
        System.out.println("Operation processed by " + getClass().getSimpleName());
    }

}
