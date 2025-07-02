class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Teacher, Subject: " + subject);
    }
}

class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Student, Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Staff, Department: " + department);
    }
}

public class SchoolSystemRoles {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Smith", 40, "Mathematics");
        Student s = new Student("Alice", 16, 10);
        Staff st = new Staff("Mrs. Brown", 35, "Administration");
        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
