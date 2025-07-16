// Q6_DataStructureSearch.java
// Problem 6: Comparing Different Data Structures for Searching

import java.util.*;

public class Q6_DataStructureSearch {
    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};
        int target = -1; // unlikely to be found
        for (int n : sizes) {
            int[] arr = new int[n];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                arr[i] = i;
                hashSet.add(i);
                treeSet.add(i);
            }
            long start, end;
            // Array search
            start = System.nanoTime();
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) { found = true; break; }
            }
            if (found) System.out.print(""); // Use found to suppress warning
            end = System.nanoTime();
            System.out.printf("Array Search (N=%d): %.4f ms\n", n, (end - start) / 1e6);
            // HashSet search
            start = System.nanoTime();
            boolean hashFound = hashSet.contains(target);
            end = System.nanoTime();
            if (hashFound) System.out.print("");
            System.out.printf("HashSet Search (N=%d): %.4f ms\n", n, (end - start) / 1e6);
            // TreeSet search
            start = System.nanoTime();
            boolean treeFound = treeSet.contains(target);
            end = System.nanoTime();
            if (treeFound) System.out.print("");
            System.out.printf("TreeSet Search (N=%d): %.4f ms\n", n, (end - start) / 1e6);
        }
    }
}
