import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("critical", "Patient heart rate irregular"),
            new Alert("info", "Doctor meeting at 3 PM"),
            new Alert("emergency", "Oxygen level dropping"),
            new Alert("info", "Lab results available")
        );


        Predicate<Alert> filter = alert -> alert.type.equals("critical") || alert.type.equals("emergency");

        alerts.stream()
              .filter(filter)
              .forEach(System.out::println);
    }
}