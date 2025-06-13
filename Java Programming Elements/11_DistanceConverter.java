import java.util.Scanner;

public class 11_DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;
        System.out.printf("The distance in yards is "+yards+" while the distance in miles is "+ miles);
    }
}