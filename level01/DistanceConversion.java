
import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        float distanceInFeet = sc.nextFloat();

        float distanceInYards = distanceInFeet / 3;
        float distanceInMiles = distanceInYards / 1760;

        float heightInCm = distanceInFeet * 30.48f;
        float heightInInches = distanceInFeet * 12;

        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + distanceInFeet + " and inches is " + heightInInches);
        System.out.println("Distance in yards: " + distanceInYards + ", Distance in miles: " + distanceInMiles);
    }
}
