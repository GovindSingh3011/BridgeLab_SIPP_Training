import java.util.Scanner;

public class 19_ShortestLongestWord {
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

    // Method to find shortest and longest word
    public static int[] findShortestLongest(String[][] arr) {
        int minIdx = 0, maxIdx = 0;
        int minLen = Integer.parseInt(arr[0][1]);
        int maxLen = Integer.parseInt(arr[0][1]);
        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < minLen) {
                minLen = len;
                minIdx = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] words = splitByCharAt(input);
        String[][] arr = getWordsAndLengths(words);
        int[] idx = findShortestLongest(arr);
        System.out.println("Word\tLength");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        System.out.println("Shortest word: " + arr[idx[0]][0] + ", Length: " + arr[idx[0]][1]);
        System.out.println("Longest word: " + arr[idx[1]][0] + ", Length: " + arr[idx[1]][1]);
    }
}
