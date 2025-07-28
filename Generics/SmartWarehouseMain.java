import java.util.*;

abstract class WarehouseItem {
    String name;
    public WarehouseItem(String name) {
        this.name = name;
    }
    public abstract void displayDetails();
}

class Electronics extends WarehouseItem {
    public Electronics(String name) { super(name); }
    public void displayDetails() {
        System.out.println("Electronics: " + name);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) { super(name); }
    public void displayDetails() {
        System.out.println("Groceries: " + name);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) { super(name); }
    public void displayDetails() {
        System.out.println("Furniture: " + name);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
    }
    public List<T> getItems() {
        return items;
    }
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayDetails();
        }
    }
}

public class SmartWarehouseMain {
    public static void main(String[] args) {
        Storage<Electronics> electronicStorage = new Storage<>();
        electronicStorage.addItem(new Electronics("Laptop"));
        electronicStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("Chair"));

        System.out.println("All Warehouse Items:");
        Storage.displayItems(electronicStorage.getItems());
        Storage.displayItems(groceryStorage.getItems());
        Storage.displayItems(furnitureStorage.getItems());
    }
}
