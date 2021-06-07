package main.structural.flyweight;

import main.structural.flyweight.constant.FlowerTypes;
import main.structural.flyweight.model.Flower;
import main.structural.flyweight.model.FlowerBunch;

enum Position {
    SALES_MANAGER, CEO, CTO, CFO, DEVELOPER
}

public class Main {

    public static void main(String[] args) {
        FlowerBunch bunch = new FlowerBunch("AAA", "BBB", 150f, FlowerTypes.DAFFODIL,
                100);
        bunch.fillBunchWithFlowers();
        System.out.println();
        for (Flower flower : bunch.getFlowers()) {
            System.out.println(flower.hashCode());
        }
        Employee manager = new SalesManager();
        System.out.println(manager);

    }
}

abstract class Employee {
    private Position position;

    public Employee(Position position) {
        this.position = position;
        System.out.println("Employer position is: " + position.name());
    }
}

class SalesManager extends Employee {
    public SalesManager() {
        super(Position.SALES_MANAGER);
    }
}