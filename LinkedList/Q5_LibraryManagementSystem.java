public class Q5_LibraryManagementSystem {
    private Node head;
    private Node tail;
    public Q5_LibraryManagementSystem() {
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
        Q5_LibraryManagementSystem library = new Q5_LibraryManagementSystem();
        library.addAtBeginning("1984", "Orwell", "Dystopian", 101, true);
        library.addAtEnd("Pride and Prejudice", "Austen", "Romance", 102, true);
        library.addAtPosition(2, "The Hobbit", "Tolkien", "Fantasy", 103, false);
        System.out.println("Forward display:");
        library.displayForward();
        System.out.println("Reverse display:");
        library.displayReverse();
        library.searchByAuthor("Orwell");
        library.updateAvailability(102, false);
        System.out.println("Total books: " + library.countBooks());
        library.removeByBookId(101);
        System.out.println("After deletion:");
        library.displayForward();
    }

    // Add at beginning
    public void addAtBeginning(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        Node newNode = new Node(bookTitle, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at end
    public void addAtEnd(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        Node newNode = new Node(bookTitle, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at position
    public void addAtPosition(int position, String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addAtBeginning(bookTitle, author, genre, bookId, isAvailable);
            return;
        }
        Node newNode = new Node(bookTitle, author, genre, bookId, isAvailable);
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
    }

    // Remove by book ID
    public void removeByBookId(int bookId) {
        Node current = head;
        while (current != null && current.bookId != bookId) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Book ID not found");
            return;
        }
        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Search by book title
    public void searchByBookTitle(String bookTitle) {
        Node current = head;
        while (current != null) {
            if (current.bookTitle.equals(bookTitle)) {
                System.out.println(current.bookTitle + ", " + current.author + ", " + current.genre + ", " + current.bookId + ", " + current.isAvailable);
            }
            current = current.next;
        }
    }

    // Search by author
    public void searchByAuthor(String author) {
        Node current = head;
        while (current != null) {
            if (current.author.equals(author)) {
                System.out.println(current.bookTitle + ", " + current.author + ", " + current.genre + ", " + current.bookId + ", " + current.isAvailable);
            }
            current = current.next;
        }
    }

    // Update availability
    public void updateAvailability(int bookId, boolean isAvailable) {
        Node current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                current.isAvailable = isAvailable;
                System.out.println("Availability updated for book ID " + bookId);
                return;
            }
            current = current.next;
        }
        System.out.println("Book ID not found");
    }

    // Display forward
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.println(current.bookTitle + ", " + current.author + ", " + current.genre + ", " + current.bookId + ", " + current.isAvailable);
            current = current.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.bookTitle + ", " + current.author + ", " + current.genre + ", " + current.bookId + ", " + current.isAvailable);
            current = current.prev;
        }
    }

    // Count books
    public int countBooks() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    class Node {
        String bookTitle;
        String author;
        String genre;
        int bookId;
        boolean isAvailable;
        Node next;
        Node prev;

        Node(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
            this.bookTitle = bookTitle;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.isAvailable = isAvailable;
            this.next = null;
            this.prev = null;
        }
    }
}