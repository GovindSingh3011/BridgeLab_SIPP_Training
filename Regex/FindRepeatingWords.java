import java.util.regex.*;
import java.util.*;

public class FindRepeatingWords {
    public static Set<String> findRepeatingWords(String text) {
        Set<String> repeats = new HashSet<>();
        Matcher matcher = Pattern.compile("\\b(\\w+)\\s+\\1\\b").matcher(text);
        while (matcher.find()) repeats.add(matcher.group(1));
        return repeats;
    }
}