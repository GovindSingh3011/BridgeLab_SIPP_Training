
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle (in cm): ");
        float base = sc.nextFloat();

        System.out.print("Enter height of triangle (in cm): ");
        float height = sc.nextFloat();

        float areaInCm = 0.5f * base * height;
        float areaInInches = areaInCm * 0.1550f;

        float heightInFeet = height / 30.48f;
        float heightInInches = height / 2.54f;

        System.out.println("Area of Triangle: " + areaInCm + " sq cm or " + areaInInches + " sq inches.");
        System.out.println("Your Height in cm is " + height + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
    }
}
