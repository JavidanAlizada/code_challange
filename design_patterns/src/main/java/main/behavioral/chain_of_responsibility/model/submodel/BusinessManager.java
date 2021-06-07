package main.behavioral.chain_of_responsibility.model.submodel;

import main.behavioral.chain_of_responsibility.constant.Operations;
import main.behavioral.chain_of_responsibility.model.BankEmployee;

public class BusinessManager extends BankEmployee {

    public BusinessManager() {
        super(Operations.BUSINESS_PARTNER);
    }

    @Override
    public void process(Operations operations) {
        if (!isValidResponsibilityForGivenOperation(operations)) {
            System.out.println("BusinessManager is highest levet manager");
            return;
        }
        System.out.println("Operation processed by " + getClass().getSimpleName());
    }

}
