public class ReplaceMultipleSpaces {
    public static String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s{2,}", " ");
    }
}