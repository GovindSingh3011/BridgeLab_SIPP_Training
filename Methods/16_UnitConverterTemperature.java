import java.util.Scanner;

public class 16_UnitConverterTemperature {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
        scanner.close();
    }
}