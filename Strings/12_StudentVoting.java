import java.util.Random;

public class 12_StudentVoting {
    // Method to generate random ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + rand.nextInt(90); // random 2-digit age
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] arr) {
        System.out.println("Age\tCan Vote");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[] ages = generateAges(n);
        String[][] result = checkVoting(ages);
        displayTable(result);
    }
}
