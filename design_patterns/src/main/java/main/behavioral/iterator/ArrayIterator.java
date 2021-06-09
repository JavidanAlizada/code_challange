package main.behavioral.iterator;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Sales> {
    private Sales[] sales;
    private int idx;

    public ArrayIterator(Sales[] sales) {
        this.sales = sales;
    }

    @Override
    public boolean hasNext() {
        return idx < sales.length;
    }

    @Override
    public Sales next() {
        Sales sale = sales[idx];
        idx++;
        return sale;
    }
}
