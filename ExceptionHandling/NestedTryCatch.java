public class NestedTryCatch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        int index = 1;
        int divisor = 0;
        try {
            try {
                int value = array[index];
                System.out.println("Value: " + value);
                System.out.println("Result: " + (value / divisor));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        }
    }
}