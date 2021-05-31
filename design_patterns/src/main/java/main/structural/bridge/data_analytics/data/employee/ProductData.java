package main.structural.bridge.data_analytics.data.employee;

import main.structural.bridge.data_analytics.data.Data;

public class ProductData extends Data {

    private String name;
    private String type;
    private float price;

    public ProductData(String name, String type, float price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public ProductData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductData{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
