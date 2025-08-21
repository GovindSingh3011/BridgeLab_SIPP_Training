public class ValidateLicensePlate {
    public static boolean isValidLicensePlate(String plate) {
        return plate.matches("^[A-Z]{2}\d{4}$");
    }
}