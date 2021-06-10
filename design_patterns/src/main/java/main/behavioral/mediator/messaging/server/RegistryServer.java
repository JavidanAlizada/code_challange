package main.behavioral.mediator.messaging.server;

import main.behavioral.mediator.messaging.service.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegistryServer {

    private List<Service> services;

    public RegistryServer() {
        this.services = new ArrayList<>();
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(Service... service) {
        this.services.addAll(Arrays.asList(service));
    }

    @Override
    public String toString() {
        return "RegistryServer{" +
                "services=" + services +
                '}';
    }
}
