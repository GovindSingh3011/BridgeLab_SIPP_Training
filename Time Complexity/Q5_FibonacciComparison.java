// Q5_FibonacciComparison.java
// Problem 5: Recursive vs Iterative Fibonacci Computation

public class Q5_FibonacciComparison {
    // Recursive Fibonacci
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] ns = {10, 30, 50};
        for (int n : ns) {
            long start, end;
            // Recursive (skip for large n)
            if (n <= 30) {
                start = System.nanoTime();
                fibonacciRecursive(n);
                end = System.nanoTime();
                System.out.printf("Recursive (N=%d): %.4f ms\n", n, (end - start) / 1e6);
            } else {
                System.out.printf("Recursive (N=%d): Unfeasible\n", n);
            }
            // Iterative
            start = System.nanoTime();
            fibonacciIterative(n);
            end = System.nanoTime();
            System.out.printf("Iterative (N=%d): %.4f ms\n", n, (end - start) / 1e6);
        }
    }
}
