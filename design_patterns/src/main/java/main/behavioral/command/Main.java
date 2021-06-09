package main.behavioral.command;

import main.behavioral.command.impl.AgeValidator;
import main.behavioral.command.impl.EntityValidator;
import main.behavioral.command.impl.NonZeroValidator;
import main.behavioral.command.impl.TextLengthValidator;
import main.behavioral.command.model.Address;
import main.behavioral.command.model.User;
import main.behavioral.command.model.UserDetail;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        ValidationController.validate(new AgeValidator(10, 41), 40, 19);

        UserDetail detail = new UserDetail("Javidan", "", 21);
        Address address = new Address("Az", "Baku", "Khatai");
        ValidationController.validate(new EntityValidator(), detail, address, new User(detail, address));

        ValidationController.validate(new NonZeroValidator(), BigDecimal.TEN, BigInteger.ZERO);

        ValidationController.validate(new TextLengthValidator(2, 5), "Javidan", "Alizada");

    }
}
