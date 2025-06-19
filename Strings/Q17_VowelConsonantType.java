import java.util.Scanner;

public class Q17_VowelConsonantType {
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32); // to lowercase
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] getCharTypes(String str) {
        String[][] arr = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            arr[i][0] = String.valueOf(str.charAt(i));
            arr[i][1] = checkCharType(str.charAt(i));
        }
        return arr;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] result = getCharTypes(input);
        displayTable(result);
    }
}
