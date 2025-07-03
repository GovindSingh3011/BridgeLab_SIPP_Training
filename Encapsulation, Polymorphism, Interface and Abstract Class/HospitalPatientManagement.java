abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    protected void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    protected String getDiagnosis() { return diagnosis; }
    public abstract double calculateBill();
    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private String record = "";
    public InPatient(int patientId, String name, int age, double roomCharge) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
    }
    @Override
    public double calculateBill() { return roomCharge * 5; }
    @Override
    public void addRecord(String record) { this.record += record + "\n"; }
    @Override
    public void viewRecords() { System.out.println(this.record); }
}
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String record = "";
    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }
    @Override
    public double calculateBill() { return consultationFee; }
    @Override
    public void addRecord(String record) { this.record += record + "\n"; }
    @Override
    public void viewRecords() { System.out.println(this.record); }
}

class HospitalManagementSystem {
    public static void processPatients(Patient[] patients) {
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
        }
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(1, "Alice", 30, 1000),
            new OutPatient(2, "Bob", 25, 500)
        };
        System.out.println("Hospital Patient Management:");
        HospitalManagementSystem.processPatients(patients);
    }
}
