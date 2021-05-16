package main.structural.adapter.target;

import main.structural.adapter.target.AccountPayment;

public class CryptoCurrencyAccountPayment implements AccountPayment {
    @Override
    public void pay(String clientCodeId) {
        System.out.println("Payment done from crypt currency account by client: " + clientCodeId);
    }
}
