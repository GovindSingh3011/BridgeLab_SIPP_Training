import java.util.Scanner;

public class Q11_TrimSpacesCharAt {
    public static int[] trimIndices(String str) {
        int len = getLength(str);
        int start = 0, end = len - 1;
        while (start < len && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String substringByCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) {
            sb.append(str.charAt(i));
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

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();
        int[] indices = trimIndices(input);
        String trimmedManual = substringByCharAt(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();
        boolean isSame = compareByCharAt(trimmedManual, trimmedBuiltIn);
        System.out.println("Manual trim: '" + trimmedManual + "'");
        System.out.println("Built-in trim: '" + trimmedBuiltIn + "'");
        System.out.println("Are both trims equal? " + isSame);
    }
}
