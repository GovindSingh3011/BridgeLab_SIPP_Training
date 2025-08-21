public class ValidatePANCard {
    public static boolean isValidPAN(String pan) {
        return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
    }
}