package main.creational.factory;

import main.creational.factory.constant.BankNames;
import main.creational.factory.process.CreditProcess;
import main.creational.factory.process.DepositProcess;

public abstract class BankOperationFactory {

    public abstract CreditProcess creditProcess(BankNames bank);

    public abstract DepositProcess depositProcess(BankNames bank);
}
