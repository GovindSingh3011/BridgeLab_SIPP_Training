import java.util.Scanner;

public class 06_SumNaturalNumbers {
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Sum of first " + n + " natural numbers: " + sumOfNaturalNumbers(n));
        scanner.close();
    }
}