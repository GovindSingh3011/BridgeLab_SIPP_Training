import java.util.Scanner;

public class 16_WordsWithLengths {
    // Method to split text into words using charAt
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

    // Method to find length without using length()
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

    // Method to get 2D array of words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(getLength(words[i]));
        }
        return arr;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] arr) {
        System.out.println("Word\tLength");
        for (String[] row : arr) {
            int len = Integer.parseInt(row[1]);
            System.out.println(row[0] + "\t" + len);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] words = splitByCharAt(input);
        String[][] arr = getWordsAndLengths(words);
        displayTable(arr);
    }
}
