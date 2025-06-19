import java.util.Scanner;

public class Q02_TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double[] result = new double[3];
        result[0] = Math.sin(radians);
        result[1] = Math.cos(radians);
        result[2] = Math.tan(radians);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angle = scanner.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
        scanner.close();
    }
}