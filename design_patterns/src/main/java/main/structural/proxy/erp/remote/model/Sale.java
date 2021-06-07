package main.structural.proxy.erp.remote.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@XmlRootElement(name = "sales")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Sale implements Serializable, Storable {

    private List<Product> product;
    private LocalDateTime salesDate;

    public Sale(List<Product> product, LocalDateTime salesDate) {
        this.product = product;
        this.salesDate = salesDate;
    }

    public Sale() {
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public LocalDateTime getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(LocalDateTime salesDate) {
        this.salesDate = salesDate;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "product=" + product +
                ", salesDate=" + salesDate +
                '}';
    }
}
