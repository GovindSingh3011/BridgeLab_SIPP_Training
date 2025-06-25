class Q11_BookLibrary {
    public String ISBN;
    protected String title;
    private String author;
    public Q11_BookLibrary(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
}
class Q11_EBook extends Q11_BookLibrary {
    public String format;
    public Q11_EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }
    public void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Format: " + format);
    }
    public static void main(String[] args) {
        Q11_EBook ebook = new Q11_EBook("12345", "Java Programming", "James Gosling", "PDF");
        ebook.display();
        System.out.println("Author: " + ebook.getAuthor());
        ebook.setAuthor("New Author");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
