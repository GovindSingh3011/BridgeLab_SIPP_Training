abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;
    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    protected String getInsurancePolicyNumber() { return insurancePolicyNumber; }
    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 2000; }
    public String getInsuranceDetails() { return "Car Insurance: Policy " + getInsurancePolicyNumber(); }
}
class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }
    public double calculateRentalCost(int days) { return getRentalRate() * days * 0.8; }
    public double calculateInsurance() { return 500; }
    public String getInsuranceDetails() { return "Bike Insurance: Policy " + getInsurancePolicyNumber(); }
}
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
    public double calculateInsurance() { return 3000; }
    public String getInsuranceDetails() { return "Truck Insurance: Policy " + getInsurancePolicyNumber(); }
}

class VehicleRentalSystem {
    public static void processVehicles(Vehicle[] vehicles, int days) {
        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " Rental Cost: " + v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                System.out.println(((Insurable)v).getInsuranceDetails() + ", Insurance Cost: " + ((Insurable)v).calculateInsurance());
            }
        }
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("C123", 1000, "P1001"),
            new Bike("B456", 300, "P2002"),
            new Truck("T789", 2000, "P3003")
        };
        System.out.println("Vehicle Rental System:");
        VehicleRentalSystem.processVehicles(vehicles, 5);
    }
}
