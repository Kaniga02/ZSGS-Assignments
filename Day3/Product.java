package Day3;

public class Product {
    int productId;
    String name;
    double price;
    int quantity;

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void displayProduct() {
        System.out.format("%-10d %-15s %-10.2f %-10d\n", productId, name, price, quantity);
    }
}