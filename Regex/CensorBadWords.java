import java.util.*;

public class CensorBadWords {
    public static String censorBadWords(String text, List<String> badWords) {
        for (String word : badWords) {
            text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
        }
        return text;
    }
}