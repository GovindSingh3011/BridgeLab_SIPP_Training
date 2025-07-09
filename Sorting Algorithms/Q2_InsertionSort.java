import java.util.Arrays;
import java.util.Scanner;

public class Q2_InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        int[] ids = new int[n];
        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }
        insertionSort(ids);
        System.out.println("Sorted employee IDs: " + Arrays.toString(ids));
    }
}
