package main.behavioral.chain_of_responsibility;

import main.behavioral.chain_of_responsibility.constant.Operations;
import main.behavioral.chain_of_responsibility.model.request.Request;

public class Main {

    public static void main(String[] args) {
        Request request = new Request(Operations.BUSINESS_CREDIT);
        BankService service = new BankService(request);
        service.executeRequest();
    }
}
