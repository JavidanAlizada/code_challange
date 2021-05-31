package main.structural.flyweight;

import main.structural.flyweight.constant.FlowerTypes;
import main.structural.flyweight.model.Flower;
import main.structural.flyweight.model.FlowerBunch;

public class Main {

    public static void main(String[] args) {
        FlowerBunch bunch = new FlowerBunch("AAA", "BBB", 150f, FlowerTypes.DAFFODIL,
                100);
        bunch.fillBunchWithFlowers();
        System.out.println();
        for (Flower flower: bunch.getFlowers()){
            System.out.println(flower.hashCode());
        }

    }
}
