class Books{
    String title="Space Wonders";
    String publicationYear="2025";
}

class Author extends Books{
    String name="Govind";
    String bio="this is my first book";

    void displayInfo(){
        System.out.println("Title: "+title+", Publication Year: "+publicationYear+", Author: "+name+", Bio: "+bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author();
        author.displayInfo();
    }
}