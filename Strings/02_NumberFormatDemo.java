import java.util.Scanner;

public class 02_NumberFormatDemo {
    // Method to generate NumberFormatException
    public static void generateNumberFormat(String text) {
        // This will throw NumberFormatException if text is not a valid integer
        int num = Integer.parseInt(text);
        System.out.println("Parsed number: " + num);
    }

    // Method to handle NumberFormatException
    public static void handleNumberFormat(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to parse as integer: ");
        String input = sc.next();
        // Uncomment to see the exception
        // generateNumberFormat(input);
        System.out.println("Demonstrating NumberFormatException handling:");
        handleNumberFormat(input);
    }
}
