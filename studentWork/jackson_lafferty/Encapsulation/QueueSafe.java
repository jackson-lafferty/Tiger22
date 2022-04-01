package Encapsulation;

import java.util.ArrayList;

public class QueueSafe {
    private ArrayList<Integer> list;

    public QueueSafe() {
        list = new ArrayList<Integer>();
    }

    public int dequeue() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.remove(0);
    }

    public void enqueue(int element) {
        list.add(element);
    }

    public String toString() {
        return list.toString();
    }
}
