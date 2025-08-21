public class ValidateUsername {
    public static boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }
}