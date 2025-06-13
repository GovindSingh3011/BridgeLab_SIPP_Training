import java.util.Scanner;
class kilometersToMiles{
public static void main(String agrs[]){
Scanner sc = new Scanner(System.in);
double km =sc.nextInt();

double mile=km/1.6;

System.out.print("The total miles is " + mile + " mile for the given " + km + " km"); 
}
}