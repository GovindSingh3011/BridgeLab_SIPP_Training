import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> voteMap = new HashMap<>();
        Map<String, Integer> voteOrder = new LinkedHashMap<>();

        voteMap.put("Alice", 3);
        voteMap.put("Bob", 5);
        voteMap.put("Charlie", 2);

        voteOrder.put("Alice", 3);
        voteOrder.put("Bob", 5);
        voteOrder.put("Charlie", 2);

        TreeMap<String, Integer> sortedVotes = new TreeMap<>(voteMap);

        System.out.println("Votes (Original Order):");
        voteOrder.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\nVotes (Sorted by Candidate):");
        sortedVotes.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}