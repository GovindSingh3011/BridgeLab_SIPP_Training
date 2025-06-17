import java.util.Scanner;

public class 22_BMICalculator {
    public static double[][] calculateBMI(double[][] data) {
        double[][] result = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
            double heightMeters = data[i][1] / 100;
            result[i][0] = data[i][0];
            result[i][1] = data[i][1];
            result[i][2] = data[i][0] / (heightMeters * heightMeters);
        }
        return result;
    }

    public static String[] getBMIStatus(double[][] bmiData) {
        String[] status = new String[bmiData.length];
        for (int i = 0; i < bmiData.length; i++) {
            double bmi = bmiData[i][2];
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = scanner.nextDouble();
            data[i][1] = scanner.nextDouble();
        }
        double[][] bmiData = calculateBMI(data);
        String[] status = getBMIStatus(bmiData);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d: Weight=%.2f kg, Height=%.2f cm, BMI=%.2f, Status=%s%n",
                i + 1, bmiData[i][0], bmiData[i][1], bmiData[i][2], status[i]);
        }
        scanner.close();
    }
}