// Q16_searchchallenge.java
// Challenge: Linear Search for First Missing Positive, Binary Search for Target Index
import java.util.Arrays;

public class Q16_searchchallenge {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1];
        for (int num : nums) {
            if (num > 0 && num <= n) present[num] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) return i;
        }
        return n + 1;
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println("First missing positive: " + firstMissingPositive(nums));
        Arrays.sort(nums);
        int target = 4;
        System.out.println("Index of " + target + ": " + binarySearch(nums, target));
    }
}
