package main.structural.bridge.data_analytics.process.visualization.impl;

import main.structural.bridge.data_analytics.data.Data;
import main.structural.bridge.data_analytics.process.visualization.Visualizer;

public class PowerBI implements Visualizer {
    @Override
    public void visualize(Data data) {
        System.out.println("Data is visualized by using: " + getClass().getSimpleName());
        System.out.println("Visualized data is: " + data);
    }
}
