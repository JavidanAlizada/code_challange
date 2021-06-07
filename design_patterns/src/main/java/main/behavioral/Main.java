package main.behavioral;

import main.behavioral.constant.Operations;
import main.behavioral.model.request.Request;

public class Main {

    public static void main(String[] args) {
        Request request = new Request(Operations.BUSINESS_CREDIT);
        BankService service = new BankService(request);
        service.executeRequest();
    }
}
