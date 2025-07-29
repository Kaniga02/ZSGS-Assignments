package Day3;
import java.util.ArrayList;

public class Store {
    static String storeName;
    static String storeLocation;

    static ArrayList<Product> productList = new ArrayList<>();

    public static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }

    public static void displayStoreDetails() {
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Location: " + storeLocation);
        System.out.println("-------------------------------");
    }
    public static void addProduct(Product product) {
        productList.add(product);
    }

    // Display all products
    public static void displayAllProducts() {
        System.out.format("%-10s %-15s %-10s %-10s\n", "ID", "Name", "Price", "Quantity");
        for (Product product : productList) {
            product.displayProduct();
        }
    }

    // Main method
    public static void main(String[] args) {
        // Set store details
        setStoreDetails("ZSGS SuperMart", "Chennai");

        // Create product objects
        Product p1 = new Product(101, "Soap", 25.0, 50);
        Product p2 = new Product(102, "Shampoo", 85.5, 30);
        Product p3 = new Product(103, "Toothpaste", 45.75, 40);

        // Add products to store
        addProduct(p1);
        addProduct(p2);
        addProduct(p3);

        // Display details
        displayStoreDetails();
        displayAllProducts();
    }
}
