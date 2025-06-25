
public class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public boolean borrowBook() {
        if (availability) {
            availability = false;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Data Structures", "Jane Smith", 399.99, true);
        System.out.println("Book available: " + book.availability);
        book.borrowBook();
        System.out.println("Book borrowed. Availability now: " + book.availability);
    }
}
