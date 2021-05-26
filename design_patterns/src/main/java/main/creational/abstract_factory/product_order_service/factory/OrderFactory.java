package main.creational.abstract_factory.product_order_service.factory;

import main.creational.abstract_factory.product_order_service.model.Product;

public interface OrderFactory {

    Product getOrderedProduct();
}
