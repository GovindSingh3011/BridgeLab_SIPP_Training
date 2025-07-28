import java.time.LocalDate;
import java.util.*;

class Policy {
    String policyNumber;
    String holderName;
    LocalDate expiryDate;

    Policy(String number, String name, LocalDate expiry) {
        this.policyNumber = number;
        this.holderName = name;
        this.expiryDate = expiry;
    }

    public String toString() {
        return policyNumber + " - " + holderName + " - " + expiryDate;
    }
}

public class InsurancePolicyManagement {
    public static void main(String[] args) {
        Map<String, Policy> hashMap = new HashMap<>();
        Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
        TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

        Policy p1 = new Policy("P101", "Alice", LocalDate.now().plusDays(15));
        Policy p2 = new Policy("P102", "Bob", LocalDate.now().plusDays(45));
        Policy p3 = new Policy("P103", "Alice", LocalDate.now().minusDays(5));

        for (Policy p : List.of(p1, p2, p3)) {
            hashMap.put(p.policyNumber, p);
            linkedHashMap.put(p.policyNumber, p);
            treeMap.computeIfAbsent(p.expiryDate, k -> new ArrayList<>()).add(p);
        }

        System.out.println("Retrieve by Number (P101): " + hashMap.get("P101"));

        System.out.println("\nPolicies expiring in next 30 days:");
        LocalDate now = LocalDate.now();
        LocalDate cutoff = now.plusDays(30);
        treeMap.subMap(now, true, cutoff, true).values().forEach(System.out::println);

        System.out.println("\nPolicies for Alice:");
        for (Policy p : hashMap.values()) {
            if (p.holderName.equals("Alice")) {
                System.out.println(p);
            }
        }

        System.out.println("\nRemoving expired policies...");
        hashMap.values().removeIf(p -> p.expiryDate.isBefore(now));
        hashMap.values().forEach(System.out::println);
    }
}