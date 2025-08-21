import java.util.regex.*;
import java.util.*;

public class ExtractHashtags {
    public static List<String> extractHashtags(String text) {
        List<String> tags = new ArrayList<>();
        Matcher matcher = Pattern.compile("#\\w+").matcher(text);
        while (matcher.find()) tags.add(matcher.group());
        return tags;
    }
}