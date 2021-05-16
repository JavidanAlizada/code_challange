package main.creational.factory.process.deposit;

import main.creational.factory.process.DepositProcess;

public class CAABankDepositProcess implements DepositProcess {

    @Override
    public void deposit() {
        System.out.println("CAABank has deposit operation");
    }
}
