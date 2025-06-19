import java.util.Scanner;

public class Q06_AllCharacters {
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] userChars = getChars(input);
        char[] builtInChars = input.toCharArray();

        boolean isSame = compareCharArrays(userChars, builtInChars);

        System.out.print("User-defined method result: ");
        for (char c : userChars) System.out.print(c + " ");
        System.out.println();

        System.out.print("Built-in toCharArray() result: ");
        for (char c : builtInChars) System.out.print(c + " ");
        System.out.println();

        System.out.println("Are both arrays equal? " + isSame);
    }
}
