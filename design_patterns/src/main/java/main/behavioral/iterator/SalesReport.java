package main.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SalesReport {
    private int id;
    private List<Sales> sales;

    public SalesReport(int id) {
        this.id = id;
        this.sales = new ArrayList<>();
        Sales sales = new Sales(1);
        Sales sales1 = new Sales(2);
        Sales sales2 = new Sales(3);
        Sales sales3 = new Sales(4);
        this.sales.add(sales);
        this.sales.add(sales1);
        this.sales.add(sales2);
        this.sales.add(sales3);

    }

    public int getId() {
        return id;
    }

    public Iterator<Sales> getSales() {
        return sales.iterator();
    }
}
