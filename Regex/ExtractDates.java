import java.util.regex.*;
import java.util.*;

public class ExtractDates {
    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(text);
        while (matcher.find()) dates.add(matcher.group());
        return dates;
    }
}