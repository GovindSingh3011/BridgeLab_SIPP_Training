public class 01_NullPointerDemo {
    // Method to generate NullPointerException
    public static void generateNullPointer() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleNullPointer() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Uncomment to see the exception
        // generateNullPointer();
        System.out.println("Demonstrating NullPointerException handling:");
        handleNullPointer();
    }
}
