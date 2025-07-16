// Q11_searchsentence.java
// Search for a Specific Word in a List of Sentences
public class Q11_searchsentence {
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) return sentence;
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        String[] sentences = {"Java is fun", "I love coding", "Hello world"};
        String word = "coding";
        System.out.println("Sentence: " + findSentence(sentences, word));
    }
}
