import java.util.regex.*;
import java.util.*;

public class ExtractCurrencyValues {
    public static List<String> extractCurrency(String text) {
        List<String> values = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);
        while (matcher.find()) values.add(matcher.group());
        return values;
    }
}