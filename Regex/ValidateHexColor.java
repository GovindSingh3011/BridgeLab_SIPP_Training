public class ValidateHexColor {
    public static boolean isValidHexColor(String color) {
        return color.matches("^#[0-9a-fA-F]{6}$");
    }
}