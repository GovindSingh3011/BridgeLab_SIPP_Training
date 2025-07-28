import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        HashMap<String, Double> accounts = new HashMap<>();
        accounts.put("1001", 5000.0);
        accounts.put("1002", 3000.0);
        accounts.put("1003", 7000.0);

        TreeMap<Double, String> sortedByBalance = new TreeMap<>();
        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            sortedByBalance.put(entry.getValue(), entry.getKey());
        }

        Queue<String> withdrawalQueue = new LinkedList<>();
        withdrawalQueue.add("1001");
        withdrawalQueue.add("1003");

        System.out.println("Sorted by Balance:");
        sortedByBalance.forEach((bal, acc) -> System.out.println(acc + ": $" + bal));

        System.out.println("\nProcessing Withdrawals:");
        while (!withdrawalQueue.isEmpty()) {
            String acc = withdrawalQueue.poll();
            System.out.println("Processed withdrawal for account " + acc);
        }
    }
}