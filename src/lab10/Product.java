package lab10;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Product {
    static final BlockingQueue<Object> queueA = new ArrayBlockingQueue<>(5);
    static final BlockingQueue<Object> queueB = new ArrayBlockingQueue<>(5);
    static final BlockingQueue<Object> queueC = new ArrayBlockingQueue<>(5);
    static final BlockingQueue<Object> queueD = new ArrayBlockingQueue<>(5);

    static int productCount = 0;
    static int productLimit = 10;

    @Override
    public String toString() {
        return "Склад: A:" + queueA.size() + " B:" + queueB.size() + " C:" + queueC.size() + " D:" + queueD.size();
    }
}
