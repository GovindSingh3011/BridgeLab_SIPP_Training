public class Q7_Product {
    String productName;
    double price;
    static int totalProducts = 0;
    public Q7_Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    public static void main(String[] args) {
        Q7_Product p1 = new Q7_Product("Laptop", 50000);
        Q7_Product p2 = new Q7_Product("Phone", 20000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Q7_Product.displayTotalProducts();
    }
}
