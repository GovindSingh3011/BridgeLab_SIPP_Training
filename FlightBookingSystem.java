import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Flight {
    String flightNumber;
    String destination;
    String departure;

    public Flight(String flightNumber, String destination, String departure) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
    }

    public void displayInfo() {
        System.out.println("Flight: " + flightNumber + ", From: " + departure + ", To: " + destination);
    }
}

class Booking {
    String passengerName;
    Flight flight;

    public Booking(String passengerName, Flight flight) {
        this.passengerName = passengerName;
        this.flight = flight;
    }

    public void displayBooking() {
        System.out.println("Passenger: " + passengerName + ", Flight: " + flight.flightNumber);
    }
}

public class FlightBookingSystem {
    static Flight[] flights = {new Flight("AI101", "Delhi", "Mumbai"), new Flight("AI102", "Chennai", "Delhi"), new Flight("AI103", "Bangalore", "Kolkata")};

    static List<Booking> bookings = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static void searchFlight() {
        System.out.print("Enter destination to search: ");
        String dest = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (Flight flight : flights) {
            if (flight.destination.toLowerCase().equals(dest)) {
                flight.displayInfo();
                found = true;
            }
        }
        if (!found) System.out.println("No flights found to " + dest);
    }

    static void bookFlight() {
        System.out.print("Enter flight number to book: ");
        String flightNumber = scanner.nextLine();
        Flight selectedFlight = null;

        for (Flight flight : flights) {
            if (flight.flightNumber.equalsIgnoreCase(flightNumber)) {
                selectedFlight = flight;
                break;
            }
        }

        if (selectedFlight != null) {
            System.out.print("Enter passenger name: ");
            String name = scanner.nextLine();
            bookings.add(new Booking(name, selectedFlight));
            System.out.println("Booking confirmed!");
        } else {
            System.out.println("Flight not found.");
        }
    }

    static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
        } else {
            for (Booking booking : bookings) {
                booking.displayBooking();
            }
        }
    }

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("\n1. Search Flights\n2. Book Flight\n3. View Bookings\n4. Exit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    searchFlight();
                    break;
                case 2:
                    bookFlight();
                    break;
                case 3:
                    viewBookings();
                    break;
            }
        } while (option != 4);
    }
}