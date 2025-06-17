import java.util.Scanner;

public class 29_CollinearPoints {
    public static boolean areCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return Math.abs(slopeAB - slopeBC) < 1e-10 && Math.abs(slopeAB - slopeAC) < 1e-10;
    }

    public static boolean areCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1e-10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        boolean collinearSlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = areCollinearArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear (Slope method): " + collinearSlope);
        System.out.println("Collinear (Area method): " + collinearArea);
        scanner.close();
    }
}