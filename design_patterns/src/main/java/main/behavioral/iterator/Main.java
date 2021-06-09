package main.behavioral.iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        SalesReport report = new SalesReport(1);
        Seller seller = new Seller("Javidan");
        printSales(report.getSales());
        printSales(seller.getSales());
    }


    static void printSales(Iterator<Sales> sales) {
        while (sales.hasNext())
            System.out.println(sales.next());
    }
}
