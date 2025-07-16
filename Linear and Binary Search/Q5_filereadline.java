// Q5_filereadline.java
// Read a File Line by Line Using FileReader
import java.io.*;

public class Q5_filereadline {
    public static void main(String[] args) {
        String filename = "input.txt"; // Change to your file path
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
