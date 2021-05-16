package main.creational.factory.process.deposit;

import main.creational.factory.process.DepositProcess;

public class BAABankDepositProcess implements DepositProcess {

    @Override
    public void deposit() {
        System.out.println("BAABank has deposit operation");
    }
}