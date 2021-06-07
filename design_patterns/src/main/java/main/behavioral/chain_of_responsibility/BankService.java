package main.behavioral.chain_of_responsibility;

import main.behavioral.chain_of_responsibility.model.BankEmployee;
import main.behavioral.chain_of_responsibility.model.request.Request;
import main.behavioral.chain_of_responsibility.model.submodel.*;

public class BankService {
    private final BankEmployee entryBankServiceEmployee;
    private Request request;

    public BankService(Request request) {
        this.request = request;
        entryBankServiceEmployee = new Reception();
    }

    private void initBankEmployee() {
        BankEmployee creditor = new Creditor();
        BankEmployee creditRiskManager = new CreditRiskManager();
        BankEmployee creditBranchManager = new CreditBranchManager();
        BankEmployee businessManager = new BusinessManager();
        entryBankServiceEmployee.setHighPrivilegedBankEmployee(creditor);
        creditor.setHighPrivilegedBankEmployee(creditRiskManager);
        creditRiskManager.setHighPrivilegedBankEmployee(creditBranchManager);
        creditBranchManager.setHighPrivilegedBankEmployee(businessManager);
        businessManager.setHighPrivilegedBankEmployee(null);
    }

    private BankEmployee getBankEmployee() {
        initBankEmployee();
        return this.entryBankServiceEmployee;
    }

    public void executeRequest() {
        getBankEmployee().process(this.request.getOperations());
    }
}
