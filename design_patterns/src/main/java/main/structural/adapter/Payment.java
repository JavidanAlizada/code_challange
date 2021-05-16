package main.structural.adapter;

import main.structural.adapter.constant.PaymentType;
import main.structural.adapter.source.CardPayment;
import main.structural.adapter.source.CreditCardPayment;
import main.structural.adapter.source.DebitCardPayment;
import main.structural.adapter.target.AccountPayment;
import main.structural.adapter.target.CryptoCurrencyAccountPayment;
import main.structural.adapter.target.PaypalAccountPayment;

public class Payment implements CardPayment, AccountPayment {

    private PaymentType paymentType;

    public Payment(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public void pay(String clientCodeId) {
        switch (paymentType) {
            case CREDIT:
                new CreditCardPayment().pay(clientCodeId);
                break;
            case DEBIT:
                new DebitCardPayment().pay(clientCodeId);
                break;
            case PAYPAL:
                new PaypalAccountPayment().pay(clientCodeId);
                break;
            case CRYPTOCURRENCY:
                new CryptoCurrencyAccountPayment().pay(clientCodeId);
                break;
        }
    }


}
