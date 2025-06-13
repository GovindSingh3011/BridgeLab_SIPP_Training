import java.util.Scanner;
class changeToYardsAndMiles{
public static void main(String agrs[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter Distance in feet ");
double f = sc.nextInt();

double y=f/3;

double m=y/1760;

System.out.print("The distance in yards is "+y+" while the distance in miles is "+m); 
}
}
