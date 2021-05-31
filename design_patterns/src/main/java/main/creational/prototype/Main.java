package main.creational.prototype;

import main.creational.prototype.model.Report;
import main.creational.prototype.model.User;
import main.creational.prototype.service.ReportGeneratorService;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date start = new Date();
        Report report = new ReportGeneratorService("AABB").generateReport();
        Date end = new Date();
        System.out.println(report);
        System.out.println(getProcessPeriodTime(start, end));
        Date start1 = new Date();
        Report report1 = report.clone();
        report1.getUser().setFullName("BCHIE");
        Date end1 = new Date();
        System.out.println(report1);
        System.out.println(getProcessPeriodTime(start1, end1));
        System.out.println(report+"\n"+report1);
    }

    static long getProcessPeriodTime(Date processStartedDate, Date processEndDate) {
        long mills = 1000;
        return (processEndDate.getTime() / mills) - (processStartedDate.getTime() / mills);
    }
}
