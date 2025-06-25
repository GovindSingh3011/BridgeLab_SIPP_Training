class Q10_Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    public Q10_Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}
class Q10_PostgraduateStudent extends Q10_Student {
    public String specialization;
    public Q10_PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }
    public void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", Specialization: " + specialization);
    }
    public static void main(String[] args) {
        Q10_PostgraduateStudent pg = new Q10_PostgraduateStudent(101, "Alice", 9.1, "CS");
        pg.display();
        System.out.println("CGPA: " + pg.getCGPA());
        pg.setCGPA(9.5);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
