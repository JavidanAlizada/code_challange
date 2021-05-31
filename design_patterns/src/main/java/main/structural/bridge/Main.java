package main.structural.bridge;

import main.structural.bridge.data_analytics.data.employee.EmployeeData;
import main.structural.bridge.data_analytics.data.employee.ProductData;
import main.structural.bridge.data_analytics.process.cleaning.impl.DataCleaner;
import main.structural.bridge.data_analytics.process.collection.impl.Scrapy;
import main.structural.bridge.data_analytics.process.model.impl.ClusterAnalysis;
import main.structural.bridge.data_analytics.process.model.impl.Pearson;
import main.structural.bridge.data_analytics.process.storage.impl.Excel;
import main.structural.bridge.data_analytics.process.storage.impl.SqlServerDatabase;
import main.structural.bridge.data_analytics.process.visualization.impl.PowerBI;
import main.structural.bridge.data_analytics.process.visualization.impl.Tableu;
import main.structural.bridge.data_analytics.project.DataAnalyticsProject;
import main.structural.bridge.data_analytics.project.impl.EmployeeDataAnalyticsProject;
import main.structural.bridge.data_analytics.project.impl.ProductDataAnalyticsProject;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
//        Employee data analytics project life cycle
        DataAnalyticsProject employeeProject = new EmployeeDataAnalyticsProject();
        employeeProject.setCollector(new Scrapy(new EmployeeData("Javidan", "Developer", 1000f)));
        employeeProject.setStorage(new Excel());
        employeeProject.setCleaner(new DataCleaner());
        employeeProject.setModelling(new Pearson());
        employeeProject.setVisualizer(new Tableu());
        employeeProject.showLifeCycle();
        System.out.println("\n");
//        Employee data analytics project life cycle
        DataAnalyticsProject productProject = new ProductDataAnalyticsProject();
        productProject.setCollector(new Scrapy(new ProductData("Hyundai Elantra", "Car", 20000f)));
        productProject.setStorage(new SqlServerDatabase());
        productProject.setModelling(new ClusterAnalysis());
        productProject.setVisualizer(new PowerBI());
        productProject.showLifeCycle();
    }
}
