import java.util.Scanner;
class DoubleOpt{
public static void main(String agrs[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a ");
double a = sc.nextInt();

System.out.print("Enter b ");
double b = sc.nextInt();

System.out.print("Enter c ");
double c = sc.nextInt();


System.out.print(" The results of Int Operations are "+(a + b *c)+", "+ (a * b + c) +", "+ (c + a / b) +", and "+(a % b + c)); 
}
}
