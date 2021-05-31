package main.creational.prototype.service.impl;

import main.creational.prototype.model.Service;
import main.creational.prototype.service.Request;

public class ServiceRequest implements Request<Service> {
    private Service service;

    {
        service = new Service(1, "DOTService");
    }

    public Service getService() {
        return service;
    }

    @Override
    public Service sendRequest() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.getService();
    }
}
