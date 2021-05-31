package main.structural.composite;

import main.structural.composite.model.Basket;
import main.structural.composite.model.Box;
import main.structural.composite.model.Package;
import main.structural.composite.model.Product;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("Huawei", 0.75f);
        Product product1 = new Product("Apple", 0.2f);
        Product product2 = new Product("Meat", 4f);
        Product product3 = new Product("Milk", 1f);
        Product product4 = new Product("Onion", 0.5f);
        Product product5 = new Product("Mac", 1.4f);
        Product product6 = new Product("Colgate", 0.3f);


        Package pack = new Package();
        Package pack1 = new Package();
        pack.getProducts().add(product);
        pack.getProducts().add(product1);
        pack.getProducts().add(product2);

        pack1.getProducts().add(product3);
        pack1.getProducts().add(product4);
        pack1.getProducts().add(product5);

        Box box = new Box();
        box.getPackages().add(pack1);

        Basket basket1 = new Basket();
        basket1.add(pack);
        basket1.add(product4);
        basket1.add(product4);
        basket1.add(box);
        basket1.add(product6);
        System.out.println(basket1.getSummaryWeight());
    }
}
