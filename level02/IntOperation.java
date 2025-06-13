import java.util.Scanner;
class intOperation{
public static void main(String agrs[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a ");
int a = sc.nextInt();

System.out.print("Enter b ");
int b = sc.nextInt();

System.out.print("Enter c ");
int c = sc.nextInt();


System.out.print(" The results of Int Operations are "+(a + b *c)+", "+ (a * b + c) +", "+ (c + a / b) +", and "+(a % b + c)); 
}
}
