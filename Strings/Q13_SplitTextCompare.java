import java.util.Scanner;

public class Q13_SplitTextCompare {
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

    public static String[] splitByCharAt(String str) {
        int len = getLength(str);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') wordCount++;
        }
        String[] words = new String[wordCount];
        int start = 0, wordIdx = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIdx++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIdx] = str.substring(start, len);
        return words;
    }
    
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] userWords = splitByCharAt(input);
        String[] builtInWords = input.split(" ");
        boolean isSame = compareStringArrays(userWords, builtInWords);

        System.out.print("User-defined split: ");
        for (String w : userWords) System.out.print(w + " | ");
        System.out.println();
        System.out.print("Built-in split: ");
        for (String w : builtInWords) System.out.print(w + " | ");
        System.out.println();
        System.out.println("Are both splits equal? " + isSame);
    }
}
