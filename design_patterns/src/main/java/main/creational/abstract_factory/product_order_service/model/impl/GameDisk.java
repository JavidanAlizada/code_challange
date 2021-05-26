package main.creational.abstract_factory.product_order_service.model.impl;

import main.creational.abstract_factory.product_order_service.model.Product;

import java.time.LocalDate;

public class GameDisk extends Product {

    public GameDisk(String name, float amount) {
        super(name, LocalDate.now(), amount);
    }

    @Override
    public String toString() {
        return "GameDisk{" + super.toString() + "}";
    }

}
