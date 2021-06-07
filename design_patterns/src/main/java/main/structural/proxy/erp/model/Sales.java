package main.structural.proxy.erp.model;

import java.time.LocalDateTime;
import java.util.List;

public class Sales {

    private List<Product> product;
    private LocalDateTime salesDate;

    public Sales(List<Product> product, LocalDateTime salesDate) {
        this.product = product;
        this.salesDate = salesDate;
    }

    public Sales() {
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
        return "Sales{" +
                "product=" + product +
                ", salesDate=" + salesDate +
                '}';
    }
}
