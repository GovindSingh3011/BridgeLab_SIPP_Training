// Q7_inputstreamreader.java
// Convert Byte Stream to Character Stream Using InputStreamReader
import java.io.*;

public class Q7_inputstreamreader {
    public static void main(String[] args) {
        String filename = "input.txt"; // Change to your file path
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
