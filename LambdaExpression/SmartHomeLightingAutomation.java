import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartHomeLightingAutomation {
    public static void main(String[] args) {
        Map<String, LightAction> triggers = new HashMap<>();

  
        triggers.put("motion", () -> System.out.println("Lights ON with warm glow."));
        triggers.put("morning", () -> System.out.println("Lights ON with cool daylight."));
        triggers.put("voice", () -> System.out.println("Lights blink twice and turn ON."));


        triggers.get("motion").activate();
        triggers.get("morning").activate();
        triggers.get("voice").activate();
    }
}