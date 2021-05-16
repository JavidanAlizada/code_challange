package main.creational.factory;

import main.creational.factory.constant.Operation;

public class FactoryCreator {

    public static BankOperationFactory getBankOperation(Operation operation) {
        switch (operation) {
            case CREDIT:
                return new CreditProcessFactory();
            case DEPOSIT:
                return new DepositProcessFactory();
        }
        return null;
    }
}
