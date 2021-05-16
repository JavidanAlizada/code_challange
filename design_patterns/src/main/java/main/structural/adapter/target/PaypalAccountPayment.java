package main.structural.adapter.target;

import main.structural.adapter.target.AccountPayment;

public class PaypalAccountPayment implements AccountPayment {
    @Override
    public void pay(String clientCodeId) {
        System.out.println("Payment done from paypal account by client: " + clientCodeId);
    }
}
