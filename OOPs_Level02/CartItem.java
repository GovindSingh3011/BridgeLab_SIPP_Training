public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        if (qty > 0) {
            quantity += qty;
            System.out.println(qty + " " + itemName + "(s) added to cart");
        } else {
            System.out.println("Invalid quantity");
        }
    }

    public void removeItem(int qty) {
        if (qty > 0 && qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed from cart");
        } else {
            System.out.println("Invalid quantity or insufficient items in cart");
        }
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Headphones", 79.00, 1);
        item.displayDetails();
        item.addItem(2);
        item.displayDetails();
        item.removeItem(1);
        item.displayDetails();
    }
}