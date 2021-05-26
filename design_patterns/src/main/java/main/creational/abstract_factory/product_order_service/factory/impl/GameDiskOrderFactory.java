package main.creational.abstract_factory.product_order_service.factory.impl;

import main.creational.abstract_factory.product_order_service.factory.OrderDetails;
import main.creational.abstract_factory.product_order_service.factory.OrderFactory;
import main.creational.abstract_factory.product_order_service.model.impl.GameDisk;
import main.creational.abstract_factory.product_order_service.model.Product;

public class GameDiskOrderFactory extends OrderDetails implements OrderFactory {

    public GameDiskOrderFactory(String name, float amount) {
        super(name, amount);
    }

    @Override
    public Product getOrderedProduct() {
        return new GameDisk(super.getName(), super.getAmount());
    }
}
