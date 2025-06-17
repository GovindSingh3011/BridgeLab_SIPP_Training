import java.util.Scanner;

public class 07_Handshakes {
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        System.out.println("Number of possible handshakes: " + calculateHandshakes(numberOfStudents));
        scanner.close();
    }
}