import java.util.Scanner;

public class Q20_BMIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight and height for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            heights[i] = sc.nextDouble();

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5)
                statuses[i] = "Underweight";
            else if (bmis[i] < 24.9)
                statuses[i] = "Normal";
            else if (bmis[i] < 29.9)
                statuses[i] = "Overweight";
            else
                statuses[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d - Height: %.2f, Weight: %.2f, BMI: %.2f, Status: %s%n",
                              i + 1, heights[i], weights[i], bmis[i], statuses[i]);
        }
    }
}