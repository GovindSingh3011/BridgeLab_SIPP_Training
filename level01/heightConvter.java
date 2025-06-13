import java.util.Scanner;
class heightConvter{
public static void main(String agrs[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter Height in cm ");
double cm = sc.nextInt();

double in=cm/2.54;

double foot=in/12;

System.out.print("Your Height in cm is "+ cm + " while in feet is "+foot+" and inches is "+in); 
}
}
