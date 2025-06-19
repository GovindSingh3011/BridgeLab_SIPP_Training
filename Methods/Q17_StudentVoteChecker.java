import java.util.Scanner;

public class Q17_StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            ages[i] = scanner.nextInt();
            System.out.println("Student " + (i + 1) + " can vote: " + canStudentVote(ages[i]));
        }
        scanner.close();
    }
}