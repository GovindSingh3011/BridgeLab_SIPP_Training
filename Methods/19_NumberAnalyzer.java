import java.util.Scanner;

public class 19_NumberAnalyzer {
    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        if (num1 < num2) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is " + (isEven(numbers[i]) ? "even" : "odd"));
            } else {
                System.out.println(numbers[i] + " is negative");
            }
        }
        int comparison = compare(numbers[0], numbers[4]);
        System.out.println("First and last elements are " + 
            (comparison == 0 ? "equal" : comparison > 0 ? "first > last" : "first < last"));
        scanner.close();
    }
}