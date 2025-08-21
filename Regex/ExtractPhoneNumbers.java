import java.util.regex.*;
import java.util.*;

public class ExtractPhoneNumbers {
    public static List<String> extractPhoneNumbers(String text) {
        List<String> phones = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b\\d{3}-\\d{3}-\\d{4}\\b").matcher(text);
        while (matcher.find()) phones.add(matcher.group());
        return phones;
    }
}