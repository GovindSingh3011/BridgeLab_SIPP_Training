public class Q8_Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";
    public Q8_Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }
    public static void updateInstituteName(String name) {
        instituteName = name;
    }
    public static void main(String[] args) {
        Q8_Course c1 = new Q8_Course("Java", 3, 5000);
        Q8_Course c2 = new Q8_Course("Python", 2, 4000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Q8_Course.updateInstituteName("XYZ Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
