import java.time.LocalDate;

public class 04_DateComparison {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2025, 6, 12);
        LocalDate date2 = LocalDate.of(2025, 6, 19);

        if (date1.isBefore(date2)) {
            System.out.println("Date 01 is before Date 02");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date 01 is after Date 02");
        } else {
            System.out.println("Date 01 is equal to Date 02");
        }
    }
}