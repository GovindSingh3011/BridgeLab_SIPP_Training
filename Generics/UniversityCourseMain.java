import java.util.*;

abstract class CourseType {
    String courseName;
    public CourseType(String courseName) {
        this.courseName = courseName;
    }
    public abstract void showCourseType();
}

class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }
    public void showCourseType() {
        System.out.println("Exam-Based Course: " + courseName);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }
    public void showCourseType() {
        System.out.println("Assignment-Based Course: " + courseName);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }
    public void showCourseType() {
        System.out.println("Research-Based Course: " + courseName);
    }
}

class Course<T extends CourseType> {
    T course;
    public Course(T course) {
        this.course = course;
    }
    public void displayCourse() {
        course.showCourseType();
    }

    public static void showAllCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            c.showCourseType();
        }
    }
}

public class UniversityCourseMain {
    public static void main(String[] args) {
        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse("Mathematics"));
        courses.add(new AssignmentCourse("Software Engineering"));
        courses.add(new ResearchCourse("AI Research"));

        System.out.println("Available Courses:");
        Course.showAllCourses(courses);

        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Physics"));
        examCourse.displayCourse();
    }
}
