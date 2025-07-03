abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public abstract double calculateFare(double distance);
    public void getVehicleDetails() {
        System.out.println("Vehicle: " + vehicleId + ", Driver: " + driverName + ", Rate/Km: " + ratePerKm);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class RideCar extends RideVehicle implements GPS {
    private String location;
    public RideCar(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String location) { this.location = location; }
}
class RideBike extends RideVehicle implements GPS {
    private String location;
    public RideBike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.8; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String location) { this.location = location; }
}
class RideAuto extends RideVehicle implements GPS {
    private String location;
    public RideAuto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 1.2; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String location) { this.location = location; }
}

class RideHailingApp {
    public static void processRides(RideVehicle[] vehicles, double distance) {
        for (RideVehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
        }
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        RideVehicle[] rides = {
            new RideCar("V1", "Driver1", 15),
            new RideBike("V2", "Driver2", 10),
            new RideAuto("V3", "Driver3", 12)
        };
        System.out.println("Ride-Hailing Application:");
        RideHailingApp.processRides(rides, 10);
    }
}
