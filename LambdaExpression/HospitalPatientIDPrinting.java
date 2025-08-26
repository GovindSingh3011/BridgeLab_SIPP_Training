import java.util.Arrays;
import java.util.List;

public class HospitalPatientIDPrinting {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("P1001", "P1002", "P1003", "P1004");


        patientIDs.forEach(System.out::println);
    }
}