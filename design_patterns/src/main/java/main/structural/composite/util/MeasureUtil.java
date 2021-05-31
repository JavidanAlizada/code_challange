package main.structural.composite.util;

import main.structural.composite.model.Package;
import main.structural.composite.model.Product;

import java.util.List;

public class MeasureUtil {

    public static float measureProduct(List<Product> products) {
        float weight = 0;
        for (Product product : products) {
            weight += product.getWeight();
        }
        return weight;
    }

    public static float measurePackage(List<Package> packages) {
        float weight = 0;
        for (Package pack : packages) {
            weight += measureProduct(pack.getProducts());
        }
        return weight;
    }
}
