import java.util.Scanner;

public class 21_UnitConverterLength {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yards = scanner.nextDouble();
        System.out.println("Feet: " + convertYardsToFeet(yards));
        double meters = scanner.nextDouble();
        System.out.println("Inches: " + convertMetersToInches(meters));
        double inches = scanner.nextDouble();
        System.out.println("Centimeters: " + convertInchesToCm(inches));
        scanner.close();
    }
}