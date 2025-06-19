import java.util.Scanner;

public class Q01_TriangularRun {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        System.out.println("Number of rounds: " + Math.ceil(calculateRounds(side1, side2, side3)));
        scanner.close();
    }
}
