// Q15_firstlastoccurrence.java
// Find the First and Last Occurrence of an Element in a Sorted Array
public class Q15_firstlastoccurrence {
    public static int[] findFirstLast(int[] arr, int target) {
        int first = -1, last = -1;
        int left = 0, right = arr.length - 1;
        // Find first occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        left = 0; right = arr.length - 1;
        // Find last occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return new int[]{first, last};
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;
        int[] res = findFirstLast(arr, target);
        System.out.println("First: " + res[0] + ", Last: " + res[1]);
    }
}
