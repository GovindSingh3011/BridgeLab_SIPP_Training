import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        File inputFile = new File("source.txt");
        File outputFile = new File("destination.txt");

        if (!inputFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}