import java.util.Scanner;

public class Q04_PosNegEvenOddCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                System.out.print(num + " is positive and ");
                if (num % 2 == 0)
                    System.out.println("even.");
                else
                    System.out.println("odd.");
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println("Number is zero.");
            }
        }

        if (numbers[0] > numbers[4])
            System.out.println("First element is greater than the last.");
        else if (numbers[0] < numbers[4])
            System.out.println("First element is less than the last.");
        else
            System.out.println("First and last elements are equal.");
    }
}