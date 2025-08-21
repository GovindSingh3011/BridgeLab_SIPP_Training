import java.util.regex.*;
import java.util.*;

public class ExtractLanguages {
    public static List<String> extractLanguages(String text) {
        List<String> languages = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);
        while (matcher.find()) languages.add(matcher.group());
        return languages;
    }
}