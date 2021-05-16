package main.creational.factory;

import main.creational.factory.constant.BankNames;
import main.creational.factory.constant.Operation;
import main.creational.factory.helper.BankNamesReader;
import main.creational.factory.helper.BankOperationReader;
import main.creational.factory.process.CreditProcess;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    private Scanner scanner;

    public Main(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        new Main(new Scanner(System.in)).process();
    }

    private void process() {
        System.out.println("Enter Bank Operation Type: \n" + BankOperationReader.getOperationsAsString());
        String operationType = scanner.next();
        Operation operation = Arrays.stream(BankOperationReader.getOperations())
                .filter(eachOperation -> eachOperation.toString().equals(operationType))
                .findFirst().get();
        BankOperationFactory factory = FactoryCreator.getBankOperation(operation);

        System.out.println("Enter Bank Name : \n" + BankNamesReader.getBankNamesAsString());
        String bankName = scanner.next();
        Optional<BankNames> bankNames = Arrays.stream(BankNamesReader.getBankNames())
                .filter(eachOperation -> eachOperation.toString().equals(bankName))
                .findFirst();
        if (!bankNames.isPresent())
            return;
        BankNames correctBankName = bankNames.get();
        CreditProcess credit = factory.creditProcess(correctBankName);
        credit.credit();

    }
}
