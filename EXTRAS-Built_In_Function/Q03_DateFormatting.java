import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q03_DateFormatting {
    public static void main(String[] args) {
        DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format02 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format03 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        LocalDate today = LocalDate.now();

        System.out.println("Format 1: " + today.format(format1));
        System.out.println("Format 2: " + today.format(format2));
        System.out.println("Format 3: " + today.format(format3));
    }
}
