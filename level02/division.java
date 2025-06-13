import java.util.Scanner;
class division{
public static void main(String agrs[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter  First Number");
int number1 = sc.nextInt();

System.out.print("Enter Second Number ");
int number2 = sc.nextInt();

int q=number1/number2;
int m=number1%number2;

System.out.print("The Quotient is "+q+" and Reminder is "+m); 
}
}
