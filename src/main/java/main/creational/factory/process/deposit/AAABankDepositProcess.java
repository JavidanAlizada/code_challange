package main.creational.factory.process.deposit;

import main.creational.factory.process.DepositProcess;

public class AAABankDepositProcess implements DepositProcess {

    @Override
    public void deposit() {
        System.out.println("AAABank has deposit operation");
    }
}
