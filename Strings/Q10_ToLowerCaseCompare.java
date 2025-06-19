import java.util.Scanner;

public class Q10_ToLowerCaseCompare {
    public static String toLowerCaseManual(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + 32));
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

        String manualLower = toLowerCaseManual(input);
        String builtInLower = input.toLowerCase();
        boolean isSame = compareByCharAt(manualLower, builtInLower);

        System.out.println("Manual toLowerCase: " + manualLower);
        System.out.println("Built-in toLowerCase: " + builtInLower);
        System.out.println("Are both lowercase results equal? " + isSame);
    }
}
