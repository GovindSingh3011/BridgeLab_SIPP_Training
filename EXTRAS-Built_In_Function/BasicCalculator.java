import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();
        if (op.equals("+")) System.out.println(add(a, b));
        else if (op.equals("-")) System.out.println(sub(a, b));
        else if (op.equals("*")) System.out.println(mul(a, b));
        else if (op.equals("/")) System.out.println(div(a, b));
    }
    public static int add(int a, int b) { return a + b; }
    public static int sub(int a, int b) { return a - b; }
    public static int mul(int a, int b) { return a * b; }
    public static int div(int a, int b) { return b != 0 ? a / b : 0; }
}