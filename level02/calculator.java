import java.util.Scanner;
class calculator{
public static void main(String agrs[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter First Number ");
int number1 = sc.nextInt();
System.out.print("Enter Second Number ");
int number2 = sc.nextInt();

int add=number1+number2;

int sub=number1-number2;

int mult=number1*number2;

int div=number1/number2;

System.out.print("The addition, subtraction, multiplication, and division value of 2 numbers "+number1+" and "+number2+" is "+add+", "+sub+", "+mult+", and "+div); 
}
}
