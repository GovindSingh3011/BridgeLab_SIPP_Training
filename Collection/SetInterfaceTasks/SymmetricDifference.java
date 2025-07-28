
import java.util.*;

public class SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        Set<T> tmp = new HashSet<>(set1);
        tmp.retainAll(set2);
        result.removeAll(tmp);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        System.out.println("Symmetric Difference: " + symmetricDifference(set1, set2));
    }
}
