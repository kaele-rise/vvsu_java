package lab4_1;

import java.util.ArrayList;
import java.util.Collections;

public class MyStack {
    ArrayList<Comparable> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Comparable peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.get(getSize() - 1);
    }

    public Comparable pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Comparable o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Comparable o) {
        list.add(o);
    }

    public void sort() {
        Collections.sort(list);
    }

    @Override
    public String toString() {
        return "стек=:" + list.toString();
    }
}
