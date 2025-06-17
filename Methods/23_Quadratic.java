import java.util.Scanner;

public class 23_Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[]{};
        if (delta == 0) return new double[]{-b / (2 * a)};
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots");
        } else if (roots.length == 1) {
            System.out.println("Root: " + roots[0]);
        } else {
            System.out.println("Roots: " + roots[0] + ", " + roots[1]);
        }
        scanner.close();
    }
}