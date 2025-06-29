import java.util.Arrays;
import java.util.Scanner;

class Student {

    String name;
    int[] marks = new int[3];
    String[] subject = new String[3];

    public void student(String name, String[] subjects, int[] mark) {
        this.name = name;
        this.subject = subjects;
        this.marks = mark;
    }

    public void display() {

        System.out.println("Name: " + name);

        System.out.println("Subject: " + Arrays.toString(subject));
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Grades: " + Arrays.toString(getGrades(marks)));
        System.out.println("Average Marks : " + getAvgMarks(marks));

    }

    public int getAvgMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total / marks.length;
    }

    public String[] getGrades(int[] marks) {
        String[] grades = new String[marks.length];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 90) grades[i] = "A";
            else if (marks[i] >= 80) grades[i] = "B";
            else if (marks[i] >= 70) grades[i] = "C";
            else if (marks[i] >= 60) grades[i] = "D";
            else if (marks[i] >= 50) grades[i] = "E";
            else grades[i] = "F";
        }
        return grades;
    }
}

public class StudentRecord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter Student Name: ");
        student.name = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Subject ");
            student.subject[i] = sc.next();

            System.out.println("Enter Marks ");
            int x = sc.nextInt();

            while (x < 0 || x > 100) {
                System.out.println("Invalid Marks entered! Try again");
                System.out.println("Enter Marks valid range: 0-100");
                x = sc.nextInt();
            }
            student.marks[i] = x;
        }
        student.display();
    }
}