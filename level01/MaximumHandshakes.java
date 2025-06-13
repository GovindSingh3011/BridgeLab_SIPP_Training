
import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);
    }
}
