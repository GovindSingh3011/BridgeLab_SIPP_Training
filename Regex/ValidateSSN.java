public class ValidateSSN {
    public static boolean isValidSSN(String ssn) {
        return ssn.matches("^\\d{3}-\\d{2}-\\d{4}$");
    }
}