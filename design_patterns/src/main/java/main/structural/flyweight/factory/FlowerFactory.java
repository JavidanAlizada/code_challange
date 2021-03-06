package main.structural.flyweight.factory;

import main.structural.flyweight.constant.FlowerTypes;
import main.structural.flyweight.model.Flower;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public class FlowerFactory {

    private static final Map<FlowerTypes, Flower> flowerMap = Collections.synchronizedMap(
            new EnumMap<>(FlowerTypes.class));

    public static Flower produceFlowers(FlowerTypes type) {
        if (flowerMap.get(type) == null) {
            Flower flower = new Flower(type);
            flowerMap.put(type, flower);
            return flower;
        }
        return flowerMap.get(type);
    }
}
