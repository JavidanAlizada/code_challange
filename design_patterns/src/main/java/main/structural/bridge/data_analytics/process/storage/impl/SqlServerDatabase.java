package main.structural.bridge.data_analytics.process.storage.impl;

import main.structural.bridge.data_analytics.data.Data;
import main.structural.bridge.data_analytics.process.storage.Storage;

public class SqlServerDatabase  implements Storage {

    @Override
    public void store(Data data) {
        System.out.println("Data stored by using :" + getClass().getSimpleName());
        System.out.println("Stored data is :" + data);
    }
}
