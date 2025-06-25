
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost(double ratePerDay) {
        return rentalDays * ratePerDay;
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Charlie", "Honda City", 5);
        double cost = rental.calculateTotalCost(800);
        System.out.println("Customer: " + rental.customerName + ", Model: " + rental.carModel + ", Days: " + rental.rentalDays);
        System.out.println("Total Cost: " + cost);
    }
}
