public class ValidateISBN {
    public static boolean isValidISBN(String isbn) {
        return isbn.matches("^(97(8|9))?\\d{9}(\\d|X)$");
    }
}