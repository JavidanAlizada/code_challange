package main.creational.factory;

import main.creational.factory.constant.BankNames;
import main.creational.factory.process.CreditProcess;
import main.creational.factory.process.DepositProcess;
import main.creational.factory.process.credit.AAABankCreditProcess;
import main.creational.factory.process.credit.BAABankCreditProcess;
import main.creational.factory.process.credit.CAABankCreditProcess;

public class CreditProcessFactory extends BankOperationFactory {

    public CreditProcess creditProcess(BankNames bank) {
        switch (bank) {
            case AAABank:
                return new AAABankCreditProcess();
            case BBBBank:
                return new BAABankCreditProcess();
            case CCCBank:
                return new CAABankCreditProcess();
        }
        return null;
    }

    @Override
    public DepositProcess depositProcess(BankNames bank) {
        return null;
    }
}
