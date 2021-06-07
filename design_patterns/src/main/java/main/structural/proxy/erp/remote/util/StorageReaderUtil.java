package main.structural.proxy.erp.remote.util;

import main.structural.proxy.erp.remote.constant.StorageFile;
import main.structural.proxy.erp.remote.model.Employee;
import main.structural.proxy.erp.remote.model.Sales;
import main.structural.proxy.erp.remote.model.Storable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class StorageReaderUtil {
    private static final String SALES_FILE = "sales.xml";
    private static final String EMPLOYEE_FILE = "employee.xml";

    public static List<Storable> readFileFromStorage(StorageFile file) {
        return null;
    }

//    private static List<Sales> readSalesXmlFile() throws FileNotFoundException {
//        unmarshaller = readXmlFile(SALES_FILE, Sales.class);
//        return null;
//    }
//
//    private static List<Employee> readEmployeeXmlFile() throws FileNotFoundException {
//        unmarshaller = readXmlFile(EMPLOYEE_FILE, Employee.class);
//        return null;
//    }

    private static Object readXmlFile(String fileName, Class<?> fileContentType) throws FileNotFoundException {
        File xmlFile = new File(fileName);
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(fileContentType);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            return jaxbUnmarshaller.unmarshal(xmlFile);
        } catch (JAXBException e) {
            e.printStackTrace();
            throw new FileNotFoundException(fileName + " file not found");
        }
    }
}
