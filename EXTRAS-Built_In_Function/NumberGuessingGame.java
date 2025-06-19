import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lower = 1, higher = 100;
        while (true) {
            int guess = (lower + higher) / 2;
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            String feedback = sc.next();
            if (feedback.equals("correct")) break;
            else if (feedback.equals("high")) higher = guess - 1;
            else if (feedback.equals("low")) lower = guess + 1;
        }
    }
}