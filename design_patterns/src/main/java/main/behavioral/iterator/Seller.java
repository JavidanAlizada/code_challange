package main.behavioral.iterator;

import java.util.Iterator;

public class Seller {
    private String name;
    private Sales[] sales;

    public Seller(String name) {
        this.name = name;
        this.sales = new Sales[]{new Sales(5), new Sales(6), new Sales(7), new Sales(8)};

    }

    public String getName() {
        return name;
    }

    public Iterator<Sales> getSales() {
        return new ArrayIterator(sales);
    }
}
