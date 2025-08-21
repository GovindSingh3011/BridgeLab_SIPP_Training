import java.util.regex.*;
import java.util.*;

public class ExtractCapitalizedWords {
    public static List<String> extractCapitalizedWords(String text) {
        List<String> words = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b[A-Z][a-zA-Z]*\\b").matcher(text);
        while (matcher.find()) words.add(matcher.group());
        return words;
    }
}