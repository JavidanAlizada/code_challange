package main.structural.composite.model;

import main.structural.composite.feature.Measurable;
import main.structural.composite.util.MeasureUtil;

import java.util.ArrayList;
import java.util.List;

public class Package implements Measurable {
    private List<Product> products;

    public Package() {
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public float getMeasure() {
        return MeasureUtil.measureProduct(getProducts());
    }
}
