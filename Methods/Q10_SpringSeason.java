public class Q10_SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        if (month < 3 || month > 6) return false;
        if (month == 3 && day < 20) return false;
        if (month == 6 && day > 20) return false;
        return true;
    }

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        System.out.println(isSpringSeason(month, day) ? "It's a Spring Season" : "Not a Spring Season");
    }
}