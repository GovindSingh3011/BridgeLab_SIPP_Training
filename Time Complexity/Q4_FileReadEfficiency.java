// Q4_FileReadEfficiency.java
// Problem 4: Large File Reading Efficiency
// Compares FileReader and InputStreamReader for large file reading

import java.io.*;

public class Q4_FileReadEfficiency {
    public static void main(String[] args) throws Exception {
        String filePath = "largefile.txt"; // Place a large file in the same directory
        int[] sizes = {1, 100, 500}; // MB
        for (int size : sizes) {
            System.out.printf("Reading %dMB file...\n", size);
            // FileReader
            long start = System.nanoTime();
            try (FileReader fr = new FileReader(filePath)) {
                while (fr.read() != -1) {}
            }
            long end = System.nanoTime();
            System.out.printf("FileReader: %.4f ms\n", (end - start) / 1e6);

            // InputStreamReader
            start = System.nanoTime();
            try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
                while (isr.read() != -1) {}
            }
            end = System.nanoTime();
            System.out.printf("InputStreamReader: %.4f ms\n", (end - start) / 1e6);
        }
    }
}
