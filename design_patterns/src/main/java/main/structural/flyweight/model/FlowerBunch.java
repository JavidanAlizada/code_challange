package main.structural.flyweight.model;

import main.structural.flyweight.constant.FlowerTypes;
import main.structural.flyweight.factory.FlowerFactory;

import java.util.ArrayList;
import java.util.List;

public class FlowerBunch {
    private String bunchFrom;
    private String bunchTo;
    private float price;
    private FlowerTypes flowerTypes;
    private int flowerAmountInBunch;
    //    private Set<Flower> flowers;
    private List<Flower> flowers;

    public FlowerBunch(String bunchFrom, String bunchTo, float price, FlowerTypes flowerTypes, int flowerAmountInBunch) {
        this.bunchFrom = bunchFrom;
        this.bunchTo = bunchTo;
        this.price = price;
        this.flowerTypes = flowerTypes;
        this.flowerAmountInBunch = flowerAmountInBunch;
//        flowers = new HashSet<>();
        flowers = new ArrayList<>();
    }

    public String getBunchFrom() {
        return bunchFrom;
    }

    public void setBunchFrom(String bunchFrom) {
        this.bunchFrom = bunchFrom;
    }

    public String getBunchTo() {
        return bunchTo;
    }

    public void setBunchTo(String bunchTo) {
        this.bunchTo = bunchTo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public FlowerTypes getFlowerTypes() {
        return flowerTypes;
    }

    public void setFlowerTypes(FlowerTypes flowerTypes) {
        this.flowerTypes = flowerTypes;
    }

    public int getFlowerAmountInBunch() {
        return flowerAmountInBunch;
    }

    public void setFlowerAmountInBunch(int flowerAmountInBunch) {
        this.flowerAmountInBunch = flowerAmountInBunch;
    }


    public void fillBunchWithFlowers() {
        for (int i = 0; i < flowerAmountInBunch; i++)
            flowers.add(FlowerFactory.produceFlowers(flowerTypes));
    }

    //    public HashSet<Flower> getFlowers() {
//        return flowers;
//    }
    public List<Flower> getFlowers() {
        return flowers;
    }

    @Override
    public String toString() {
        return "FlowerBunch{" +
                "bunchFrom='" + bunchFrom + '\'' +
                ", bunchTo='" + bunchTo + '\'' +
                ", price=" + price +
                ", flowerTypes=" + flowerTypes +
                ", flowerAmountInBunch=" + flowerAmountInBunch +
                ", flowers=" + flowers +
                '}';
    }
}
