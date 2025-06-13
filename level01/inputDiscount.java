import java.util.Scanner;
class inputDiscount{
public static void main(String agrs[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter Fee ");
int fee = sc.nextInt();
System.out.print("Enter Discount Percent ");
int discountPercent = sc.nextInt();

int discount = fee*discountPercent/100;

System.out.print("The discount amount is INR "+ discount+ "and final discounted fee is INR "+ (fee-discount)); 
}
}
