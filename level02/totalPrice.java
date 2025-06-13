import java.util.Scanner;
class totalPrice{
public static void main(String agrs[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter Unit Price ");
double u = sc.nextInt();

System.out.print("Enter Quantity ");
double q = sc.nextInt();

System.out.print("The total purchase price is INR "+(q*u)+" if the quantity "+q+" and unit price is INR "+ u); 
}
}
