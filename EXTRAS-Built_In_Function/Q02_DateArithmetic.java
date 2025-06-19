import java.time.LocalDate;

public class Q02_DateArithmetic {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 6, 19);
        LocalDate addDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = addDate.minusWeeks(3);
        System.out.println("Final Date: " + finalDate);
    }
}
