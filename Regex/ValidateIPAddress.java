public class ValidateIPAddress {
    public static boolean isValidIPAddress(String ip) {
        return ip.matches("^((25[0-5]|2[0-4][0-9]|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?\\d\\d?)$");
    }
}