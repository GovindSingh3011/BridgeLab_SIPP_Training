public class Q8_TextEditorUndoRedo {
    private final int MAX_SIZE = 10;
    private Node current;
    private Node head;
    private Node tail;
    private int size;
    public Q8_TextEditorUndoRedo() {
        head = null;
        tail = null;
        current = null;
        size = 0;
    }

    public static void main(String[] args) {
        Q8_TextEditorUndoRedo editor = new Q8_TextEditorUndoRedo();
        editor.addState("Text 1");
        editor.addState("Text 2");
        editor.addState("Text 3");
        editor.displayCurrent();
        editor.undo();
        editor.undo();
        editor.redo();
        editor.addState("Text 4");
        editor.displayCurrent();
    }

    // Add new state
    public void addState(String textState) {
        Node newNode = new Node(textState);
        if (head == null) {
            head = tail = current = newNode;
            size = 1;
        } else {
            // Remove redo states
            tail = current;
            tail.next = null;
            newNode.prev = current;
            current.next = newNode;
            current = newNode;
            tail = newNode;
            size++;
            // Remove oldest state if size exceeds MAX_SIZE
            if (size > MAX_SIZE) {
                head = head.next;
                head.prev = null;
                size--;
            }
        }
    }

    // Undo
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo to: " + current.textState);
        } else {
            System.out.println("No more undo states");
        }
    }

    // Redo
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo to: " + current.textState);
        } else {
            System.out.println("No more redo states");
        }
    }

    // Display current state
    public void displayCurrent() {
        if (current != null) {
            System.out.println("Current state: " + current.textState);
        } else {
            System.out.println("No state available");
        }
    }

    class Node {
        String textState;
        Node next;
        Node prev;

        Node(String textState) {
            this.textState = textState;
            this.next = null;
            this.prev = null;
        }
    }
}