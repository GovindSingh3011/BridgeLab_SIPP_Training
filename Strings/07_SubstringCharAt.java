import java.util.Scanner;

public class 07_SubstringCharAt {
    // Method to create substring using charAt
    public static String substringByCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt
    public static boolean compareStringsByCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String userSub = substringByCharAt(text, start, end);
        String builtInSub = "";
        if (start >= 0 && end <= text.length() && start < end) {
            builtInSub = text.substring(start, end);
        }

        boolean isSame = compareStringsByCharAt(userSub, builtInSub);

        System.out.println("User-defined substring: " + userSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Are both substrings equal? " + isSame);
    }
}
