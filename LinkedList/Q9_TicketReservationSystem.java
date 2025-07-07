public class Q9_TicketReservationSystem {
    private Node head;

    public Q9_TicketReservationSystem() {
        head = null;
    }

    public static void main(String[] args) {
        Q9_TicketReservationSystem system = new Q9_TicketReservationSystem();
        system.addAtEnd(1, "Alice", "Inception", "A1", "2025-07-03 10:00");
        system.addAtEnd(2, "Bob", "Titanic", "B2", "2025-07-03 12:00");
        system.addAtEnd(3, "Charlie", "Inception", "C3", "2025-07-03 14:00");
        System.out.println("All tickets:");
        system.displayAll();
        system.searchByMovieName("Inception");
        System.out.println("Total tickets: " + system.countTickets());
        system.removeByTicketId(2);
        System.out.println("After deletion:");
        system.displayAll();
    }

    // Add at end
    public void addAtEnd(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Node newNode = new Node(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = newNode;
            newNode.next = head;
        }
    }

    // Remove by ticket ID
    public void removeByTicketId(int ticketId) {
        if (head == null) return;
        Node current = head, prev = null;
        do {
            if (current.ticketId == ticketId) {
                if (current == head && current.next == head) {
                    head = null;
                } else if (current == head) {
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
        System.out.println("Ticket ID not found");
    }

    // Display all tickets
    public void displayAll() {
        if (head == null) return;
        Node current = head;
        do {
            System.out.println(current.ticketId + ", " + current.customerName + ", " + current.movieName + ", " + current.seatNumber + ", " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search by customer name
    public void searchByCustomerName(String customerName) {
        if (head == null) return;
        Node current = head;
        do {
            if (current.customerName.equals(customerName)) {
                System.out.println(current.ticketId + ", " + current.customerName + ", " + current.movieName + ", " + current.seatNumber + ", " + current.bookingTime);
            }
            current = current.next;
        } while (current != head);
    }

    // Search by movie name
    public void searchByMovieName(String movieName) {
        if (head == null) return;
        Node current = head;
        do {
            if (current.movieName.equals(movieName)) {
                System.out.println(current.ticketId + ", " + current.customerName + ", " + current.movieName + ", " + current.seatNumber + ", " + current.bookingTime);
            }
            current = current.next;
        } while (current != head);
    }

    // Count tickets
    public int countTickets() {
        if (head == null) return 0;
        int count = 0;
        Node current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }

    class Node {
        int ticketId;
        String customerName;
        String movieName;
        String seatNumber;
        String bookingTime;
        Node next;

        Node(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
            this.ticketId = ticketId;
            this.customerName = customerName;
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.bookingTime = bookingTime;
            this.next = null;
        }
    }
}