class Node {
    int Roll;
    String Name;
    int Age;
    String Grade;
    Node next;

    public Node(int roll, String name, int age, String grade) {
        Roll = roll;
        Name = name;
        Age = age;
        Grade = grade;
    }
}

public class Q1_StudentRecordManagement {
    Node head;
    Node tail;
    int size;

    public static void main(String[] args) {
        Q1_StudentRecordManagement list = new Q1_StudentRecordManagement();
        list.addBeginning(1, "A", 10, "A");
        list.addBeginning(2, "B", 11, "B");
        list.addBeginning(3, "C", 12, "C");
        list.addEnd(4, "D", 13, "D");
        list.addEnd(5, "E", 14, "E");
        list.addSpecific(2, 6, "F", 15, "F");

        list.display();
        System.out.println();

        Node temp= list.search(4);
        System.out.println("Name: "+temp.Name+"\tRoll: "+temp.Roll+"\tAge: "+temp.Age+"\tGrade: "+temp.Grade);

        System.out.println();
        list.delete(4);
        list.updateGrade(2, "A");
        list.display();
    }

    void addBeginning(int roll, String name, int age, String grade) {
        Node temp = new Node(roll, name, age, grade);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void addEnd(int roll, String name, int age, String grade) {
        Node temp = new Node(roll, name, age, grade);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void addSpecific(int pos, int roll, String name, int age, String grade) {
        Node temp = new Node(roll, name, age, grade);
        if (pos == 0) {
            addBeginning(roll, name, age, grade);
        } else if (pos == size) {
            addEnd(roll, name, age, grade);
        } else {
            Node current = head;
            for (int i = 0; i < pos - 2; i++) {
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
            size++;
        }
    }

    void delete(int deletedRoll) {

        if (head == null) {
            System.out.println("List is empty");
        } else if (head.Roll == deletedRoll) {
            head = head.next;
        } else {
            Node current = head;
            while (current.next.Roll != deletedRoll && current.next != null) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    Node search(int roll){
        Node current=head;
        while(current!=null && current.Roll!=roll){
            current=current.next;
        }
        return current;
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.Roll + " " + current.Name + " " + current.Age + " " + current.Grade);
                current = current.next;
            }
        }
    }

    void updateGrade(int roll, String grade) {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node current = head;
        while (current.Roll != roll && current != null) {
            current = current.next;
        }
        current.Grade = grade;
    }

}