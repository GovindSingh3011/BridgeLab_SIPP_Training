abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private String borrowerData;
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    protected void setBorrowerData(String data) { this.borrowerData = data; }
    protected String getBorrowerData() { return borrowerData; }
    public abstract int getLoanDuration();
    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() { return 21; }
    @Override
    public void reserveItem(String borrower) { setBorrowerData(borrower); available = false; }
    @Override
    public boolean checkAvailability() { return available; }
}
class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() { return 7; }
    @Override
    public void reserveItem(String borrower) { setBorrowerData(borrower); available = false; }
    @Override
    public boolean checkAvailability() { return available; }
}
class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() { return 14; }
    @Override
    public void reserveItem(String borrower) { setBorrowerData(borrower); available = false; }
    @Override
    public boolean checkAvailability() { return available; }
}

class LibraryManagementSystem {
    public static void processItems(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(1, "Java", "James"),
            new Magazine(2, "Tech Today", "Editor"),
            new DVD(3, "Movie", "Director")
        };
        System.out.println("Library Management System:");
        LibraryManagementSystem.processItems(items);
    }
}
