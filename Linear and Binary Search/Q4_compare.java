// Q4_compare.java
// Compare StringBuffer with StringBuilder for String Concatenation
public class Q4_compare {
    public static void main(String[] args) {
        int n = 1000000;
        String text = "hello";

        long start1 = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) sbuf.append(text);
        long end1 = System.nanoTime();
        System.out.println("StringBuffer time: " + (end1 - start1) / 1e6 + " ms");

        long start2 = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < n; i++) sbuilder.append(text);
        long end2 = System.nanoTime();
        System.out.println("StringBuilder time: " + (end2 - start2) / 1e6 + " ms");
    }
}
