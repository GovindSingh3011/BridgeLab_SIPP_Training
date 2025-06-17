import java.util.Scanner;

public class 05_WindChill {
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * windSpeed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = scanner.nextDouble();
        double windSpeed = scanner.nextDouble();
        System.out.println("Wind Chill Temperature: " + calculateWindChill(temp, windSpeed));
        scanner.close();
    }
}