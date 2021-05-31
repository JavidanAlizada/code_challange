package main.structural.bridge.data_analytics.data.employee;

import main.structural.bridge.data_analytics.data.Data;

public class EmployeeData extends Data {

    private String name;
    private String position;
    private float salary;

    public EmployeeData(String name, String position, float salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public EmployeeData() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
