package main.structural.flyweight.factory;

import main.structural.flyweight.constant.FlowerTypes;
import main.structural.flyweight.model.Flower;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

    private static Map<FlowerTypes, Flower> flowerMap = new HashMap<>();

    public static Flower produceFlowers(FlowerTypes type) {
        if (flowerMap.get(type) == null) {
            Flower flower = new Flower(type);
            flowerMap.put(type, flower);
            return flower;
        }
        return flowerMap.get(type);
    }
}
