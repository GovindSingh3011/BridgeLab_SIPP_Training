import java.util.Arrays;
import java.util.Scanner;

public class Q1_BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter student marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        bubbleSort(marks);
        System.out.println("Sorted marks: " + Arrays.toString(marks));
    }
}
