import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = Map.of("A", 1, "B", 2, "C", 1);
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            invertedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        System.out.println(invertedMap);
    }
}