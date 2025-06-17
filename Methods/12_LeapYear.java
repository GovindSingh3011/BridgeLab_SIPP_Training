import java.util.Scanner;

public class 12_LeapYear {
    public static boolean 12_isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");
        scanner.close();
    }
}