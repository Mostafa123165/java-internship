import store.PerishableProduct;
import store.Product;
import store.Stock;
import store.Store;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Store myStore = new Store("Jan's store","cairo", "Jan");
        Product p1 = new Product("Tea",5D,"the best thing to drink in the morning");
        Stock s1 = new Stock(p1,10);
        myStore.addStock(s1);

        Product p2 = new Product("Coffee",10D,"the worst thing to drink in the morning");
        Stock s2 = new Stock(p2,40);
        myStore.addStock(s2);

        Product p3 = new PerishableProduct("Gebna Roumy",10D,"the best thing to eat in the morning",
                LocalDate.now().plusDays(10));
        Stock s3 = new Stock(p3,5);
        myStore.addStock(s3);

        myStore.displayPerishableProducts(10);
        System.out.println("\n");

        myStore.displayStocks();
        System.out.println("\n");

        myStore.removeStock(2);
        myStore.displayStocks();
    }
}