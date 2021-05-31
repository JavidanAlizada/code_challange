package main.structural.bridge.data_analytics.process.model.impl;

import main.structural.bridge.data_analytics.data.Data;
import main.structural.bridge.data_analytics.process.model.Modelling;

public class Pearson implements Modelling {
    @Override
    public void applyModel(Data data) {
        System.out.println(getClass().getSimpleName() + " model applied to data");
        System.out.println("Model applied Data is : " + data);
    }
}
