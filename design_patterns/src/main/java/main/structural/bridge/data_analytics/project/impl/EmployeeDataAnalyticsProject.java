package main.structural.bridge.data_analytics.project.impl;

import main.structural.bridge.data_analytics.data.employee.EmployeeData;
import main.structural.bridge.data_analytics.project.DataAnalyticsProject;

public class EmployeeDataAnalyticsProject extends DataAnalyticsProject {

    @Override
    public void showLifeCycle() {
        EmployeeData data = (EmployeeData) getCollector().collect();
        getCleaner().clean(data);
        getStorage().store(data);
        getModelling().applyModel(data);
        getVisualizer().visualize(data);
    }
}
