package lab7;
import java.util.Arrays;


public class GenericStack<E> {
    private static int capacity = 5;

    private E[] arr;
    public int size;

    public GenericStack() {
        arr = (E[]) new Object[capacity];
        size = 0;
    }

    public void push(E o) {
        if (size == arr.length) {
            int newCapacity = arr.length * 2;
            arr = Arrays.copyOf(arr, newCapacity);
        }
        arr[size++] = o;
    }

    public E peek() {
        return arr[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "стек: " + Arrays.toString(arr);
    }
}
