package main.structural.bridge.data_analytics.process.cleaning.impl;

import main.structural.bridge.data_analytics.data.Data;
import main.structural.bridge.data_analytics.process.cleaning.Cleaner;

public class DataCleaner implements Cleaner {
    @Override
    public void clean(Data data) {
        System.out.println("Data cleaned by using :"+getClass().getSimpleName());
        System.out.println("Cleaned data is :"+data);
    }
}
