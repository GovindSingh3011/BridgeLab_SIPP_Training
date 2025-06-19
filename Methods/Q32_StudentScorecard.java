import java.util.Scanner;

public class Q32_StudentScorecard {
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            stats[i][0] = total;
            stats[i][1] = Math.round((total / 3.0) * 100.0) / 100.0;
            stats[i][2] = Math.round((total / 300.0 * 100) * 100.0) / 100.0;
        }
        return stats;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "R";
    }

    public static void displayScorecard(int[][] scores, double[][] stats) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", 
            "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.2f%-10.2f%-10s%n",
                i + 1, scores[i][0], scores[i][1], scores[i][2], 
                stats[i][0], stats[i][1], stats[i][2], getGrade(stats[i][2]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = scanner.nextInt();
        int[][] scores = generateScores(numStudents);
        double[][] stats = calculateStats(scores);
        displayScorecard(scores, stats);
        scanner.close();
    }
}