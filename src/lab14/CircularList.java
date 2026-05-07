package lab14;

import java.util.ArrayList;
import java.util.List;

public class CircularList<T extends Comparable<T>> {

    private final List<T> items;
    private final T first;

    public CircularList(List<T> items_) {
        items = items_;
        first = items_.get(0);
    }

    public Iterator<T> getIterator() {
        return new CircularIterator();
    }

    private class CircularIterator implements Iterator<T> {
        private int currentIndex = -1;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public boolean hasPrevious() {
            return true;
        }

        @Override
        public T next() {
            int start = (currentIndex + 1) % items.size();
            int index = start;
            do {
                if (items.get(index).compareTo(first) >= 0) {
                    currentIndex = index;
                    return items.get(index);
                }
                index = (index + 1) % items.size();
            } while (index != start);
            return first;
        }

        @Override
        public T previous() {
            int start;
            if (currentIndex == -1) {
                start = items.size() - 1;
            } else {
                start = (currentIndex - 1 + items.size()) % items.size();
            }
            int index = start;
            do {
                if (items.get(index).compareTo(first) >= 0) {
                    currentIndex = index;
                    return items.get(index);
                }
                index = (index - 1 + items.size()) % items.size();
            } while (index != start);
            return first;
        }
    }
}