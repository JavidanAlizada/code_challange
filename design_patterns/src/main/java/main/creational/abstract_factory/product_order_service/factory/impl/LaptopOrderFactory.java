package main.creational.abstract_factory.product_order_service.factory.impl;

import main.creational.abstract_factory.product_order_service.factory.OrderDetails;
import main.creational.abstract_factory.product_order_service.factory.OrderFactory;
import main.creational.abstract_factory.product_order_service.model.impl.Laptop;
import main.creational.abstract_factory.product_order_service.model.Product;

public class LaptopOrderFactory extends OrderDetails implements OrderFactory {

    public LaptopOrderFactory(String name, float amount) {
        super(name, amount);
    }

    @Override
    public Product getOrderedProduct() {
        return new Laptop(super.getName(), super.getAmount());
    }
}
