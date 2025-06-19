import java.util.Scanner;

public class Q04_NumberChecker {
    public static int checkNumber(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = checkNumber(number);
        System.out.println(result == 1 ? "Positive" : result == -1 ? "Negative" : "Zero");
        scanner.close();
    }
}