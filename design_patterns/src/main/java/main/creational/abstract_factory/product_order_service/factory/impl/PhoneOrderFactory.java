package main.creational.abstract_factory.product_order_service.factory.impl;

import main.creational.abstract_factory.product_order_service.factory.OrderDetails;
import main.creational.abstract_factory.product_order_service.factory.OrderFactory;
import main.creational.abstract_factory.product_order_service.model.impl.Phone;
import main.creational.abstract_factory.product_order_service.model.Product;

public class PhoneOrderFactory extends OrderDetails implements OrderFactory {

    public PhoneOrderFactory(String name, float amount) {
        super(name, amount);
    }

    @Override
    public Product getOrderedProduct() {
        return new Phone(super.getName(), super.getAmount());
    }

}
