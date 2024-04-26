package store;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private String name;
    private String location;
    private String owner;
    private List<Stock> stocks;


    public Store(String name, String location, String owner) {
        this.name = name;
        this.location = location;
        this.owner = owner;
        this.stocks = new ArrayList<>();
    }

    public void displayStocks() {
        for(Stock stock : stocks) {
            System.out.println(stock);
        }
    }

    public void displayPerishableProducts(int maximumQuantity) {
        for(Stock stock : stocks) {
            Product p = stock.getProduct();
            if(p instanceof PerishableProduct && stock.getQuantity() < maximumQuantity) {
                System.out.println(p);
            }
        }
    }

    public void addStock(Stock s) {
        long lastId = stocks.isEmpty() ? 0 : stocks.getLast().getId() ;
        s.setId(lastId+1);
        stocks.add(s);
    }

    public void removeStock(long id) {
        stocks.removeIf(stock -> stock.getId() == id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

}
