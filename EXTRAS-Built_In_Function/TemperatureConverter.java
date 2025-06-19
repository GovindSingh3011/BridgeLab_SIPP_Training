import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        String type = sc.next();
        if (type.equals("C")) System.out.println("Fahrenheit: " + cToF(temp));
        else if (type.equals("F")) System.out.println("Celsius: " + fToC(temp));
    }
    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }
    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }
}