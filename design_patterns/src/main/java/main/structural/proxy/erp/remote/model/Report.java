package main.structural.proxy.erp.remote.model;


import main.structural.proxy.erp.model.Sales;

import java.util.List;

public class Report {

    private List<Sale> sales;
    private List<Employee> employee;

    public Report(List<Sale> sales, List<Employee> employee) {
        this.sales = sales;
        this.employee = employee;
    }

    public Report() {
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Report{" +
                "sales=" + sales +
                ", employee=" + employee +
                '}';
    }
}
