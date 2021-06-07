package main.structural.proxy.erp.model;

import java.util.List;

public class Report {

    private List<Sales> sales;
    private List<Employee> employee;

    public Report(List<Sales> sales, List<Employee> employee) {
        this.sales = sales;
        this.employee = employee;
    }

    public Report() {
    }

    public List<Sales> getSales() {
        return sales;
    }

    public void setSales(List<Sales> sales) {
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
