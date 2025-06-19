import java.util.Scanner;

public class Q35_EuclideanDistance {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("Distance: " + calculateDistance(x1, y1, x2, y2));
        double[] line = findLineEquation(x1, y1, x2, y2);
        System.out.printf("Line equation: y = %.2fx + %.2f%n", line[0], line[1]);
        scanner.close();
    }
}