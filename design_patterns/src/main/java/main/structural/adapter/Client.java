package main.structural.adapter;

import main.structural.adapter.source.CardPayment;

public class Client {
    private String clientCodeId;
    private CardPayment cardPayment;

    public Client(String clientCodeId) {
        this.clientCodeId = clientCodeId;
    }

    public CardPayment getCardPayment() {
        return cardPayment;
    }

    public void setCardPayment(CardPayment cardPayment) {
        this.cardPayment = cardPayment;
    }

    public void pay() {
        if (cardPayment == null) {
            System.err.println("Please enter payment type");
            return;
        }
        cardPayment.pay(clientCodeId);
    }
}
