package main.creational.prototype.model;

public class Report implements Cloneable{

    private int id;
    private String reportName;
    private Service fromService;
    private User user;

    public Report(int id, String reportName, Service fromService, User user) {
        this.id = id;
        this.reportName = reportName;
        this.fromService = fromService;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getReportName() {
        return reportName;
    }

    public Service getFromService() {
        return fromService;
    }

    public User getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public void setFromService(Service fromService) {
        this.fromService = fromService;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", reportName='" + reportName + '\'' +
                ", fromService=" + fromService +
                ", user=" + user +
                '}';
    }

    @Override
    public Report clone() throws CloneNotSupportedException {
        Report report =  (Report) super.clone();
        User user = report.getUser().clone();
        Service service = report.getFromService().clone();

        report.setUser(user);
        report.setFromService(service);
        return report;
    }
}
