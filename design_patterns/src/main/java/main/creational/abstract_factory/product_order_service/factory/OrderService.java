package main.creational.abstract_factory.product_order_service.factory;

import main.creational.abstract_factory.product_order_service.constant.GameDiskNames;
import main.creational.abstract_factory.product_order_service.constant.LaptopNames;
import main.creational.abstract_factory.product_order_service.constant.PhoneNames;
import main.creational.abstract_factory.product_order_service.factory.impl.GameDiskOrderFactory;
import main.creational.abstract_factory.product_order_service.factory.impl.LaptopOrderFactory;
import main.creational.abstract_factory.product_order_service.factory.impl.PhoneOrderFactory;

import java.util.Arrays;

public class OrderService {

    public OrderFactory prepareOrder(OrderDetails orderDetails) {
        if (containsProductName(GameDiskNames.class, orderDetails.getName()))
            return new GameDiskOrderFactory(orderDetails.getName(), orderDetails.getAmount());
        else if (containsProductName(LaptopNames.class, orderDetails.getName()))
            return new LaptopOrderFactory(orderDetails.getName(), orderDetails.getAmount());
        else if (containsProductName(PhoneNames.class, orderDetails.getName()))
            return new PhoneOrderFactory(orderDetails.getName(), orderDetails.getAmount());
        else return null;
    }

    private <T extends Enum<T>> boolean containsProductName(Class<T> constantName, String productName) {
        return Arrays.stream(constantName.getEnumConstants())
                .anyMatch(name -> name.toString().equals(productName.trim().toUpperCase()));
    }
}
