
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person(p1);
        System.out.println("Original Person: " + p1.name + ", " + p1.age);
        System.out.println("Copied Person: " + p2.name + ", " + p2.age);
    }
}
