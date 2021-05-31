package main.structural.composite.model;

import main.structural.composite.feature.Measurable;

public class Product implements Measurable {
    private String name;
    private float weight;

    public Product(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public float getMeasure() {
        return getWeight();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
