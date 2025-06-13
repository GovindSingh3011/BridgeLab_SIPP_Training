import java.util.Scanner;

public class 20_ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        System.out.printf("The number of chocolates each child gets is "+chocolatesPerChild+" and the number of remaining chocolates is "+ remainingChocolates);
    }
}