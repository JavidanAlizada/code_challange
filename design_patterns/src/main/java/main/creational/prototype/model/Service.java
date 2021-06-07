package main.creational.prototype.model;

public class Service implements Cloneable{
    private int id;
    private String serviceName;

    public Service(int id, String serviceName) {
        this.id = id;
        this.serviceName = serviceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "BankService{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }

    @Override
    public Service clone() throws CloneNotSupportedException {
        return (Service) super.clone();
    }
}
