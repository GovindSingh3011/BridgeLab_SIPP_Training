public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(String seat, double ticketPrice) {
        this.seatNumber = seat;
        this.price = ticketPrice;
        System.out.println("Ticket booked for seat " + seat);
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", "A12", 12.50);
        ticket.displayDetails();
        ticket.bookTicket("B15", 15.00);
        ticket.displayDetails();
    }
}