package main.structural.proxy.erp.model;

public class Employee {

    private String empName;
    private String empPosition;
    private float salary;

    public Employee(String empName, String empPosition, float salary) {
        this.empName = empName;
        this.empPosition = empPosition;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empPosition='" + empPosition + '\'' +
                ", salary=" + salary +
                '}';
    }
}
