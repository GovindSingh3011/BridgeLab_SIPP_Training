import java.util.regex.*;
import java.util.*;

public class ExtractEmails {
    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        Matcher matcher = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}").matcher(text);
        while (matcher.find()) emails.add(matcher.group());
        return emails;
    }
}