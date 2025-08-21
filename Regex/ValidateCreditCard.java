public class ValidateCreditCard {
    public static boolean isValidVisa(String card) {
        return card.matches("^4\\d{15}$");
    }
    public static boolean isValidMasterCard(String card) {
        return card.matches("^5\\d{15}$");
    }
}