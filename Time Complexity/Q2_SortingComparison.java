// Q2_SortingComparison.java
// Problem 2: Sorting Large Data Efficiently
// Compares Bubble Sort, Merge Sort, and Quick Sort

import java.util.*;

public class Q2_SortingComparison {
    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Utility to generate random array
    public static int[] generateArray(int n, int bound) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = rand.nextInt(bound);
        return arr;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        for (int n : sizes) {
            int[] arr1 = generateArray(n, n * 2);
            int[] arr2 = Arrays.copyOf(arr1, arr1.length);
            int[] arr3 = Arrays.copyOf(arr1, arr1.length);
            long start, end;

            // Bubble Sort (skip for very large N)
            if (n <= 10000) {
                start = System.nanoTime();
                bubbleSort(arr1);
                end = System.nanoTime();
                System.out.printf("Bubble Sort (N=%d): %.4f ms\n", n, (end - start) / 1e6);
            } else {
                System.out.printf("Bubble Sort (N=%d): Unfeasible\n", n);
            }

            // Merge Sort
            start = System.nanoTime();
            mergeSort(arr2, 0, arr2.length - 1);
            end = System.nanoTime();
            System.out.printf("Merge Sort (N=%d): %.4f ms\n", n, (end - start) / 1e6);

            // Quick Sort
            start = System.nanoTime();
            quickSort(arr3, 0, arr3.length - 1);
            end = System.nanoTime();
            System.out.printf("Quick Sort (N=%d): %.4f ms\n", n, (end - start) / 1e6);
        }
    }
}
