import java.util.Comparator;
import java.util.List;

public class ProductService {

    List<Product> products = Product.addDummyData();

    List<Product> getProductByCategory(String category) {
        return products
                .stream()
                .filter(value -> value.getCategory().equals(category))
                .toList();
    }

    List<Product> getProductsByCategoryAndPrice(String category , double price) {
        return products
                .stream()
                .filter(value -> value.getCategory().equals(category) && value.getPrice() > price )
                .toList();
    }

    List<Product> getProductByCategoryWithDiscount(String category,double discount) {
        return products
                .stream()
                .filter(value -> value.getCategory().equals(category))
                .peek(value -> value.setPrice(value.getPrice() * discount))
                .toList();
    }

    Product getCheapestProductByCategory(String category) {
     return products.stream()
                        .filter(product -> product.getCategory().equals(category))
                        .min(Comparator.comparingDouble(Product::getPrice))
                        .orElse(null);
    }

}
