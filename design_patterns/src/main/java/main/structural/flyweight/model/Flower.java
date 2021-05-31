package main.structural.flyweight.model;

import main.structural.flyweight.constant.FlowerTypes;

public class Flower {
    private FlowerTypes flowerType;

    public Flower(FlowerTypes flowerType) {
        this.flowerType = flowerType;
    }

    public FlowerTypes getFlowerType() {
        return flowerType;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerType=" + flowerType +
                '}';
    }
}
