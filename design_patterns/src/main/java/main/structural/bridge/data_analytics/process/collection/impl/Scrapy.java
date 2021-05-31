package main.structural.bridge.data_analytics.process.collection.impl;

import main.structural.bridge.data_analytics.data.Data;
import main.structural.bridge.data_analytics.process.collection.Collector;

public class Scrapy implements Collector {
    private final Data data;

    public Scrapy(Data data) {
        this.data = data;
    }

    @Override
    public Data collect() {
        System.out.println("Data collecting by using :" + this.getClass().getSimpleName());
        return data;
    }
}
