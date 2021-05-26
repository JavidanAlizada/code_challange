package main.creational.abstract_factory;

import main.creational.abstract_factory.product_order_service.factory.OrderService;
import main.creational.abstract_factory.product_order_service.factory.OrderDetails;
import main.creational.abstract_factory.product_order_service.factory.OrderFactory;
import main.creational.abstract_factory.product_order_service.model.Product;

public class Main {
    public static void main(String[] args) {
        OrderDetails orderDetails = new OrderDetails("GTA", 1500f);
        OrderFactory factory = new OrderService().prepareOrder(orderDetails);
        Product product = null;
        if (factory != null)
            product = factory.getOrderedProduct();
        System.out.println(product);
    }
}
