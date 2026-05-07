package lab14;

public interface Iterator<T> {
    boolean hasNext();
    boolean hasPrevious();
    T next();
    T previous();
}
