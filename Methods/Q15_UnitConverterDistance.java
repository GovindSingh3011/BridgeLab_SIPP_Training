import java.util.Scanner;

public class Q15_UnitConverterDistance {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km = scanner.nextDouble();
        System.out.println("Miles: " + convertKmToMiles(km));
        System.out.println("Kilometers: " + convertMilesToKm(convertKmToMiles(km)));
        double meters = scanner.nextDouble();
        System.out.println("Feet: " + convertMetersToFeet(meters));
        System.out.println("Meters: " + convertFeetToMeters(convertMetersToFeet(meters)));
        scanner.close();
    }
}