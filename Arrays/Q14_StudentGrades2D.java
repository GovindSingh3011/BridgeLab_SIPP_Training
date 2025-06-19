import java.util.Scanner;

public class Q14_StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; ) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            int sum = 0;
            boolean valid = true;

            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) {
                    valid = false;
                    break;
                }
                sum += marks[i][j];
            }

            if (!valid) {
                System.out.println("Invalid marks. Try again.");
                continue;
            }

            percentages[i] = sum / 3.0;
            grades[i] = (percentages[i] >= 90) ? 'A' :
                        (percentages[i] >= 75) ? 'B' :
                        (percentages[i] >= 60) ? 'C' :
                        (percentages[i] >= 40) ? 'D' : 'F';

            i++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Percentage = " + percentages[i] + "%, Grade = " + grades[i]);
        }
    }
}