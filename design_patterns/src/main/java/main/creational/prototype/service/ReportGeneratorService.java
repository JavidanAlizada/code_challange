package main.creational.prototype.service;

import main.creational.prototype.model.Report;
import main.creational.prototype.model.Service;
import main.creational.prototype.model.User;
import main.creational.prototype.service.impl.ServiceRequest;
import main.creational.prototype.service.impl.UserRequest;

public class ReportGeneratorService {
    private String reportName;

    public ReportGeneratorService(String reportName) {
        this.reportName = reportName;
    }

    public Report generateReport() {
        User user = getUserDetails();
        Service service = getServiceDetails();
        return new Report(1, reportName, service, user);
    }

    private User getUserDetails() {
        Request<User> userRequest = new UserRequest();
        return userRequest.sendRequest();
    }

    private Service getServiceDetails() {
        Request<Service> serviceRequest = new ServiceRequest();
        return serviceRequest.sendRequest();
    }
}
