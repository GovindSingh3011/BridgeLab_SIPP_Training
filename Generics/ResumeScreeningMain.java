import java.util.*;

abstract class JobRole {
    String roleName;
    public JobRole(String roleName) {
        this.roleName = roleName;
    }
    public abstract void displayRole();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
    public void displayRole() {
        System.out.println("Screening for: " + roleName);
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }
    public void displayRole() {
        System.out.println("Screening for: " + roleName);
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }
    public void displayRole() {
        System.out.println("Screening for: " + roleName);
    }
}

class Resume<T extends JobRole> {
    private T role;
    public Resume(T role) {
        this.role = role;
    }
    public void processResume() {
        role.displayRole();
    }
    public static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            role.displayRole();
        }
    }
}

public class ResumeScreeningMain {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> resume1 = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> resume2 = new Resume<>(new DataScientist());
        Resume<ProductManager> resume3 = new Resume<>(new ProductManager());

        resume1.processResume();
        resume2.processResume();
        resume3.processResume();

        List<JobRole> jobRoles = new ArrayList<>();
        jobRoles.add(new SoftwareEngineer());
        jobRoles.add(new DataScientist());
        jobRoles.add(new ProductManager());

        System.out.println("Batch Screening:");
        Resume.screenResumes(jobRoles);
    }
}
