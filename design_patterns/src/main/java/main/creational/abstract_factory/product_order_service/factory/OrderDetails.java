package main.creational.abstract_factory.product_order_service.factory;

public class OrderDetails {
    private String name;
    private float amount;

    public OrderDetails(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public float getAmount() {
        return amount;
    }
}
