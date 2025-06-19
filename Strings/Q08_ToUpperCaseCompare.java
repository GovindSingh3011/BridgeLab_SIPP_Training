import java.util.Scanner;

public class Q08_ToUpperCaseCompare {
    public static String toUpperCaseManual(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append((char)(c - 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean compareByCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String manualUpper = toUpperCaseManual(input);
        String builtInUpper = input.toUpperCase();
        boolean isSame = compareByCharAt(manualUpper, builtInUpper);

        System.out.println("Manual toUpperCase: " + manualUpper);
        System.out.println("Built-in toUpperCase: " + builtInUpper);
        System.out.println("Are both uppercase results equal? " + isSame);
    }
}
