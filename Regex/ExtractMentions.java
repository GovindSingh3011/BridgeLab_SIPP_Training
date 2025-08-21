import java.util.regex.*;
import java.util.*;

public class ExtractMentions {
    public static List<String> extractMentions(String text) {
        List<String> mentions = new ArrayList<>();
        Matcher matcher = Pattern.compile("@\\w+").matcher(text);
        while (matcher.find()) mentions.add(matcher.group());
        return mentions;
    }
}