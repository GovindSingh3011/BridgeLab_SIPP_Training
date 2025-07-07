public class Q3_TaskScheduler {
    class Node {
        int taskId;
        String taskName;
        int priority;
        String dueDate;
        Node next;

        Node(int taskId, String taskName, int priority, String dueDate) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
            this.next = null;
        }
    }

    private Node head;

    public TaskScheduler() {
        head = null;
    }

    // Add at beginning
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            newNode.next = head;
            last.next = newNode;
            head = newNode;
        }
    }

    // Add at end
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = newNode;
            newNode.next = head;
        }
    }

    // Add at position
    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        Node current = head;
        for (int i = 1; i < position - 1 && current.next != head; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Remove by task ID
    public void removeByTaskId(int taskId) {
        if (head == null) return;
        Node current = head, prev = null;
        do {
            if (current.taskId == taskId) {
                if (current == head && current.next == head) {
                    head = null;
                } else if (current == head) {
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
        System.out.println("Task ID not found");
    }

    // View current and move to next
    public void viewCurrentAndMove() {
        if (head == null) {
            System.out.println("No tasks");
            return;
        }
        System.out.println("Current task: " + head.taskId + ", " + head.taskName + ", " + head.priority + ", " + head.dueDate);
        head = head.next;
    }

    // Display all tasks
    public void displayAll() {
        if (head == null) return;
        Node current = head;
        do {
            System.out.println(current.taskId + ", " + current.taskName + ", " + current.priority + ", " + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    // Search by priority
    public void searchByPriority(int priority) {
        if (head == null) return;
        Node current = head;
        do {
            if (current.priority == priority) {
                System.out.println(current.taskId + ", " + current.taskName + ", " + current.priority + ", " + current.dueDate);
            }
            current = current.next;
        } while (current != head);
    }

    public static void main(String[] args) {
        Q3_TaskScheduler scheduler = new Q3_TaskScheduler();
        scheduler.addAtBeginning(1, "Task1", 3, "2025-07-04");
        scheduler.addAtEnd(2, "Task2", 1, "2025-07-05");
        scheduler.addAtPosition(2, 3, "Task3", 2, "2025-07-06");
        System.out.println("All tasks:");
        scheduler.displayAll();
        scheduler.viewCurrentAndMove();
        scheduler.searchByPriority(2);
        scheduler.removeByTaskId(2);
        System.out.println("After deletion:");
        scheduler.displayAll();
    }
}