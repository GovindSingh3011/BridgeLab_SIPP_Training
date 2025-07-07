class Node {
    String Title;
    String Director;
    int Year;
    int Rating;

    Node next;
    Node previous;

    public Node(String title, String director, int year, int rating) {
        Title = title;
        Director = director;
        Year = year;
        Rating = rating;
    }
}

public class Q2_MovieManagementSystem {

    Node head;
    Node tail;

    public static void main(String[] args) {
        Q2_MovieManagementSystem movie = new Q2_MovieManagementSystem();

        movie.addBeginning("Avengers: Infinity War", "Anthony", 2018, 8);
        movie.addEnd("The Godfather", "John", 1972, 9);
        movie.addBeginning("The Dark Knight", "Bruce", 2008, 9);
        movie.addEnd("The Lord of the Rings: The Return of the King", "J.R.R.Tolkien", 2003, 8);
        movie.addEnd("The Lord of the Rings: The Fellowship of the Ring", "J.R.R.Tolkien", 2001, 8);
        movie.display();

        System.out.println("------------------------------------------\n");
        movie.search("Anthony");
        System.out.println();
        movie.search(8);

        System.out.println("------------------------------------------\n");
        movie.delete("The Godfather");
        movie.delete("The Dark Knight");
        movie.delete("The Lord of the Rings: The Return of the King");
        movie.display();

        System.out.println("------------------------------------------\n");
        movie.updateRating("Avengers: Infinity War", 10);
        movie.display();
    }

    void addBeginning(String title, String director, int year, int rating) {
        Node temp = new Node(title, director, year, rating);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.previous = temp;
            head = temp;
        }
    }

    void addEnd(String title, String director, int year, int rating) {
        Node temp = new Node(title, director, year, rating);

        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.previous = tail;
            tail = temp;
        }
    }

    void delete(String title) {

        if (head == null) {
            return;
        }

        Node current = head;

        if (current.Title.equals(title)) {
            head = head.next;

            if (head != null) {
                head.previous = null;
            } else {
                tail = null;
            }

            return;
        }
        while (current.next != null && !current.next.Title.equals(title)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    void search(String director) {
        Node current = head;
        boolean found = false;

        System.out.println("Movies directed by " + director + ":");
        while (current != null) {
            if (current.Director.equals(director)) {
                System.out.println(current.Title + "\tRelease on: " + current.Year + "\tRating: " + current.Rating);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No movies found for director: " + director);
        }
    }

    void search(int rating) {
        Node current = head;
        boolean found = false;

        System.out.println("Movies with rating " + rating + ":");
        while (current != null) {
            if (current.Rating == rating) {
                System.out.println(current.Title + "\tDirected by " + current.Director + "\tRelease on: " + current.Year);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No movies found with rating: " + rating);
        }
    }

    void updateRating(String title, int newRating) {
        Node current = head;
        while (current != null && !current.Title.equals(title)) {
            current = current.next;
        }
        if (current != null) {
            current.Rating = newRating;
        } else {
            System.out.println("Movie not found");
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.Title + "\tDirected by " + temp.Director + "\tRelease on: " + temp.Year + "\tRating: " + temp.Rating);
            temp = temp.next;
            System.out.println();
        }
    }
}