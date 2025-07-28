
import java.util.*;

public class CircularBuffer {
    int[] buffer;
    int head = 0;
    int count = 0;
    int size;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void insert(int value) {
        buffer[(head + count) % size] = value;
        if (count < size) {
            count++;
        } else {
            head = (head + 1) % size;
        }
    }

    public List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(buffer[(head + i) % size]);
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);
        System.out.println("Circular Buffer: " + cb.getBuffer());
    }
}
