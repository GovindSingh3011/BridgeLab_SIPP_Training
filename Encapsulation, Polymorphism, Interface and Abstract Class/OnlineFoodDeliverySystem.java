abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public abstract double calculateTotalPrice();
    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.1; }
    @Override
    public String getDiscountDetails() { return "10% Veg Discount"; }
}
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity() + 20; }
    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.05; }
    @Override
    public String getDiscountDetails() { return "5% Non-Veg Discount + 20 extra charge"; }
}

class FoodDeliverySystem {
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            item.getItemDetails();
            double discount = (item instanceof Discountable) ? ((Discountable)item).applyDiscount() : 0;
            double total = item.calculateTotalPrice() - discount;
            System.out.println("Total after discount: " + total);
        }
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] foodItems = {
            new VegItem("Paneer", 150, 2),
            new NonVegItem("Chicken", 200, 1)
        };
        System.out.println("Online Food Delivery System:");
        FoodDeliverySystem.processOrder(foodItems);
    }
}
