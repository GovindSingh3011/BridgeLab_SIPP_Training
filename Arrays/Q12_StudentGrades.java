import java.util.Scanner;

public class Q12_StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
                sum += marks[i][j];
            }
            percentages[i] = sum / 3.0;
            grades[i] = (percentages[i] >= 90) ? 'A' :
                        (percentages[i] >= 75) ? 'B' :
                        (percentages[i] >= 60) ? 'C' :
                        (percentages[i] >= 40) ? 'D' : 'F';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Percentage = " + percentages[i] + "%, Grade = " + grades[i]);
        }
    }
}