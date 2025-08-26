import java.util.Arrays;
import java.util.List;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Aman", "Priya", "Rahul");

        employees.stream()
                 .map(String::toUpperCase) 
                 .forEach(System.out::println);
    }
}