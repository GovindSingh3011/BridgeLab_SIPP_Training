// Q3_StringConcatPerformance.java
// Problem 3: String Concatenation Performance
// Compares String, StringBuilder, and StringBuffer for concatenation

public class Q3_StringConcatPerformance {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        for (int n : sizes) {
            // String
            long start = System.nanoTime();
            String s = "";
            for (int i = 0; i < n; i++) s += "a";
            System.out.print(s.hashCode()); // Use s to avoid unused warning
            long end = System.nanoTime();
            System.out.printf("String (N=%d): %.4f ms\n", n, (end - start) / 1e6);

            // StringBuilder
            start = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) sb.append('a');
            if (sb.length() == -1) System.out.print("");
            end = System.nanoTime();
            System.out.printf("StringBuilder (N=%d): %.4f ms\n", n, (end - start) / 1e6);

            // StringBuffer
            start = System.nanoTime();
            StringBuffer sbuf = new StringBuffer();
            for (int i = 0; i < n; i++) sbuf.append('a');
            System.out.print(sbuf.hashCode()); // Use sbuf to avoid unused warning
            end = System.nanoTime();
            System.out.printf("StringBuffer (N=%d): %.4f ms\n", n, (end - start) / 1e6);
        }
    }
}
