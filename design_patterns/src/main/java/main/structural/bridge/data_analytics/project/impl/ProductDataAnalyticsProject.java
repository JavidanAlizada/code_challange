package main.structural.bridge.data_analytics.project.impl;

import main.structural.bridge.data_analytics.data.employee.ProductData;
import main.structural.bridge.data_analytics.project.DataAnalyticsProject;

public class ProductDataAnalyticsProject extends DataAnalyticsProject {
    @Override
    public void showLifeCycle() {
        ProductData data = (ProductData) getCollector().collect();
//        getCleaner().clean(data);
        getStorage().store(data);
        getModelling().applyModel(data);
        getVisualizer().visualize(data);
    }
}
