package main.creational.factory;

import main.creational.factory.constant.BankNames;
import main.creational.factory.process.CreditProcess;
import main.creational.factory.process.DepositProcess;
import main.creational.factory.process.deposit.AAABankDepositProcess;
import main.creational.factory.process.deposit.BAABankDepositProcess;
import main.creational.factory.process.deposit.CAABankDepositProcess;

public class DepositProcessFactory extends BankOperationFactory {
    @Override
    public CreditProcess creditProcess(BankNames bank) {
        return null;
    }

    @Override
    public DepositProcess depositProcess(BankNames bank) {
        switch (bank) {
            case AAABank:
                return new AAABankDepositProcess();
            case BBBBank:
                return new BAABankDepositProcess();
            case CCCBank:
                return new CAABankDepositProcess();
        }
        return null;
    }
}
