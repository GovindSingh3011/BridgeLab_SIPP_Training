import java.util.Scanner;

public class 24_EmployeeBonus {
    public static double[][] generateEmployeeData(int numEmployees) {
        double[][] data = new double[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = (int) (Math.random() * 90000 + 10000);
            data[i][1] = (int) (Math.random() * 10 + 1);
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonusRate = data[i][1] > 5 ? 0.05 : 0.02;
            result[i][0] = data[i][0] + (data[i][0] * bonusRate);
            result[i][1] = data[i][0] * bonusRate;
        }
        return result;
    }

    public static void displaySummary(double[][] data, double[][] bonusData) {
        double oldSalarySum = 0, newSalarySum = 0, totalBonus = 0;
        System.out.printf("%-10s%-15s%-15s%-15s%n", "Employee", "Old Salary", "New Salary", "Bonus");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10d%-15.2f%-15.2f%-15.2f%n", 
                i + 1, data[i][0], bonusData[i][0], bonusData[i][1]);
            oldSalarySum += data[i][0];
            newSalarySum += bonusData[i][0];
            totalBonus += bonusData[i][1];
        }
        System.out.println("Total Old Salary: " + oldSalarySum);
        System.out.println("Total New Salary: " + newSalarySum);
        System.out.println("Total Bonus: " + totalBonus);
    }

    public static void main(String[] args) {
        double[][] data = generateEmployeeData(10);
        double[][] bonusData = calculateBonus(data);
        displaySummary(data, bonusData);
    }
}