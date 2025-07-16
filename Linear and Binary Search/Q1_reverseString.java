// Q1_reverseString.java
// Reverse a String Using StringBuilder
public class Q1_reverseString {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Reversed: " + reverse(input));
    }
}