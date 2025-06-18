import java.util.Scanner;

public class 05_IllegalArgumentDemo {
    // Method to generate IllegalArgumentException
    public static void generateException(String text, int start, int end) {
        // This will throw StringIndexOutOfBoundsException (which is a subclass of IndexOutOfBoundsException)
        System.out.println(text.substring(start, end));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text, int start, int end) {
        try {
            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        // Uncomment to see the exception
        // generateException(input, end, start);
        System.out.println("Demonstrating IllegalArgumentException handling:");
        handleException(input, end, start);
    }
}
