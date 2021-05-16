package main.structural.adapter;

import main.structural.adapter.constant.PaymentType;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("AZEJavidan205!!001");
        client.setCardPayment(new Payment(PaymentType.CRYPTOCURRENCY));
        client.pay();
    }
}
