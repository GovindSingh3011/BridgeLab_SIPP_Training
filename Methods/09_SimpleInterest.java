import java.util.Scanner;

public class 09_SimpleInterest {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();
        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is: " + interest);
        scanner.close();
    }
}