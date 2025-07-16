// Q9_challenge.java
// Challenge: Compare StringBuilder, StringBuffer, FileReader, and InputStreamReader
import java.io.*;

public class Q9_challenge {
    public static void main(String[] args) throws Exception {
        // StringBuilder and StringBuffer concatenation
        int n = 1000000;
        String text = "hello";
        long start1 = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < n; i++) sbuilder.append(text);
        long end1 = System.nanoTime();
        System.out.println("StringBuilder time: " + (end1 - start1) / 1e6 + " ms");

        long start2 = System.nanoTime();
        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < n; i++) sbuffer.append(text);
        long end2 = System.nanoTime();
        System.out.println("StringBuffer time: " + (end2 - start2) / 1e6 + " ms");

        // FileReader word count
        String filename = "input.txt"; // Use a large file for real test
        long start3 = System.nanoTime();
        int wordCount1 = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount1 += line.split("\\s+").length;
            }
        }
        long end3 = System.nanoTime();
        System.out.println("FileReader word count: " + wordCount1 + ", time: " + (end3 - start3) / 1e6 + " ms");

        // InputStreamReader word count
        long start4 = System.nanoTime();
        int wordCount2 = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount2 += line.split("\\s+").length;
            }
        }
        long end4 = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCount2 + ", time: " + (end4 - start4) / 1e6 + " ms");
    }
}
