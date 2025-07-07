public class Q4_InventoryManagementSystem {
    private Node head;

    public Q4_InventoryManagementSystem() {
        head = null;
    }

    public static void main(String[] args) {
        Q4_InventoryManagementSystem inventory = new Q4_InventoryManagementSystem();
        inventory.addAtBeginning("Laptop", 101, 10, 999.99);
        inventory.addAtEnd("Phone", 102, 20, 499.99);
        inventory.addAtPosition(2, "Tablet", 103, 15, 299.99);
        System.out.println("All items:");
        inventory.displayAll();
        inventory.searchByItemName("Laptop");
        inventory.updateQuantity(102, 25);
        System.out.println("Total value: " + inventory.calculateTotalValue());
        inventory.sortByPrice();
        System.out.println("After sorting by price:");
        inventory.displayAll();
        inventory.removeByItemId(101);
        System.out.println("After deletion:");
        inventory.displayAll();
    }

    // Add at beginning
    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        Node newNode = new Node(itemName, itemId, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        Node newNode = new Node(itemName, itemId, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Add at position
    public void addAtPosition(int position, String itemName, int itemId, int quantity, double price) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        Node newNode = new Node(itemName, itemId, quantity, price);
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Remove by item ID
    public void removeByItemId(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.itemId != itemId) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Item ID not found");
            return;
        }
        current.next = current.next.next;
    }

    // Update quantity
    public void updateQuantity(int itemId, int newQuantity) {
        Node current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                current.quantity = newQuantity;
                System.out.println("Quantity updated for item ID " + itemId);
                return;
            }
            current = current.next;
        }
        System.out.println("Item ID not found");
    }

    // Search by item ID
    public void searchByItemId(int itemId) {
        Node current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                System.out.println(current.itemName + ", " + current.itemId + ", " + current.quantity + ", " + current.price);
                return;
            }
            current = current.next;
        }
        System.out.println("Item ID not found");
    }

    // Search by item name
    public void searchByItemName(String itemName) {
        Node current = head;
        while (current != null) {
            if (current.itemName.equals(itemName)) {
                System.out.println(current.itemName + ", " + current.itemId + ", " + current.quantity + ", " + current.price);
            }
            current = current.next;
        }
    }

    // Calculate total value
    public double calculateTotalValue() {
        double total = 0;
        Node current = head;
        while (current != null) {
            total += current.quantity * current.price;
            current = current.next;
        }
        return total;
    }

    // Sort by item name
    public void sortByItemName() {
        if (head == null || head.next == null) return;
        Node sorted = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            if (sorted == null || sorted.itemName.compareTo(current.itemName) > 0) {
                current.next = sorted;
                sorted = current;
            } else {
                Node temp = sorted;
                while (temp.next != null && temp.next.itemName.compareTo(current.itemName) < 0) {
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }
            current = next;
        }
        head = sorted;
    }

    // Sort by price
    public void sortByPrice() {
        if (head == null || head.next == null) return;
        Node sorted = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            if (sorted == null || sorted.price > current.price) {
                current.next = sorted;
                sorted = current;
            } else {
                Node temp = sorted;
                while (temp.next != null && temp.next.price < current.price) {
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }
            current = next;
        }
        head = sorted;
    }

    // Display all items
    public void displayAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.itemName + ", " + current.itemId + ", " + current.quantity + ", " + current.price);
            current = current.next;
        }
    }

    class Node {
        String itemName;
        int itemId;
        int quantity;
        double price;
        Node next;

        Node(String itemName, int itemId, int quantity, double price) {
            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }
}