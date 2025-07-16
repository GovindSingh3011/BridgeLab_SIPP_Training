// Q8_userinput.java
// Read User Input and Write to File Using InputStreamReader
import java.io.*;

public class Q8_userinput {
    public static void main(String[] args) {
        String filename = "output.txt";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            String line;
            System.out.println("Enter text (type 'exit' to finish):");
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
