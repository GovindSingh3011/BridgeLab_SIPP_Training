
public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        HotelBooking hb1 = new HotelBooking("Bob", "Deluxe", 3);
        HotelBooking hb2 = new HotelBooking(hb1);
        System.out.println("Original Booking: " + hb1.guestName + ", " + hb1.roomType + ", " + hb1.nights);
        System.out.println("Copied Booking: " + hb2.guestName + ", " + hb2.roomType + ", " + hb2.nights);
    }
}
