package main.structural.proxy.erp.remote.repository;

import main.structural.proxy.erp.model.Report;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReportGenerator extends Remote {

    Report generateReport() throws RemoteException;
}
