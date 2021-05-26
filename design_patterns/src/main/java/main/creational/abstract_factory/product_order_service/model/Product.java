package main.creational.abstract_factory.product_order_service.model;

import java.time.LocalDate;

public abstract class Product {
    private String name;
    private LocalDate year;
    private float amount;

    public Product(String name, LocalDate year, float amount) {
        this.name = name;
        this.year = year;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public LocalDate getYear() {
        return year;
    }

    public float getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", year=" + year +
                ", amount=" + amount;
    }
}
