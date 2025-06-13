import java.util.Scanner;
class tringleArea{
public static void main(String agrs[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter Base ");
double b = sc.nextInt();

System.out.print("Enter Height ");
double h = sc.nextInt();

double area=(1/2)*b*h;

double areaIn=(1/2)*(b/2.54)*(h/2.54);

System.out.print("The Area of the triangle in sq in is "+areaIn+" and sq cm is "+area); 
}
}
