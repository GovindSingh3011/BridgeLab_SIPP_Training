// Q3_stringbuffer.java
// Concatenate Strings Efficiently Using StringBuffer
public class Q3_stringbuffer {
    public static String concatStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] arr = {"Hello", " ", "World", "!"};
        System.out.println("Concatenated: " + concatStrings(arr));
    }
}
