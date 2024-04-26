package store;

import java.time.LocalDate;

public class PerishableProduct extends Product{

    private LocalDate expireDate;

    public PerishableProduct(String name, Double price, String description , LocalDate expireDate) {
        super(name, price, description);
        this.expireDate = expireDate;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                super.toString() + "}" +
                "Perishable{" +
                "expireDate=" + expireDate +
                '}';
    }
}
