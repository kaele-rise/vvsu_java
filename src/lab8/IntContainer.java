package lab8;

import java.util.Arrays;

public class IntContainer<E> {
    private static int capacity = 5;

    private int[] arr;
    private int size;

    public IntContainer() {
        arr = new int[capacity];
        size = 0;
    }

    public void push(int o) throws FullException {
        if (size == capacity) {
            throw new FullException("элемент не может быть добавлен (контейнер полон)");
        }
        arr[size++] = o;
    }

    public void pop() throws EmptyException {
        if (size == 0) {
            throw new EmptyException("элемент не может быть удален (контейнер пуст)");
        }
        --size;
    }

    public void sort() throws SortException {
        if (size == 0) {
            throw new SortException("контейнер не может быть отсортирован (контейнер пуст)" );
        }

        boolean allEq = true;
        for (int i = 1; i < size; i++) {
            if (arr[i] != arr [0]) {
                allEq = false;
                break;
            }
        }
        if (allEq) {
            throw new SortException("контейнер не может быть отсортирован (все элементы равны)");
        }

        Arrays.sort(arr, 0, size);
    }

    public int find(int value) throws MultipleException {
        int index = -1;
        for (int i = 1; i < size; i++) {
            if (arr[i] == value) {
                if (index != -1) {
                    throw new MultipleException("в массиве несколько элементов этого значения: " + value);
                }
                index = i;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(arr, size));
    }


}
