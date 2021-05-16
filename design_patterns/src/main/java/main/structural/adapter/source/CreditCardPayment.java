package main.structural.adapter.source;

import main.structural.adapter.source.CardPayment;

public class CreditCardPayment implements CardPayment {

    @Override
    public void pay(String clientCodeId) {
        System.out.println("Payment done from credit card by client: " + clientCodeId);
    }
}
