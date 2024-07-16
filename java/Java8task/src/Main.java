
public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductService();

        System.out.println(productService.getProductByCategory("Books"));

        System.out.println(productService.getProductsByCategoryAndPrice("Books" , 100.0));

        System.out.println(productService.getProductByCategoryWithDiscount("Toys",0.1));

        System.out.println(productService.getCheapestProductByCategory("Books"));


        Product product = new Product(40,"Test" ,"TestCategory",100) ;
        System.out.println(product.withPrice(150))  ;
    }
}