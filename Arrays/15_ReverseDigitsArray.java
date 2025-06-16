import java.util.Scanner;

public class 15_ReverseDigitsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = new int[10];
        int index = 0;

        while (number > 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        System.out.println("Reversed digits:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}