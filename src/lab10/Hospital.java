package lab10;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Hospital {
    public static void main(String[] args) throws InterruptedException {
        int nurses = 3;
        int patient = 10;

        BlockingQueue<Patient> queue = new LinkedBlockingQueue<>();
        Random rand = new Random();
        AtomicInteger servedCount = new AtomicInteger(0);

        for (int i = 1; i <= patient; i++) {
            int time = 1 + rand.nextInt(5);
            queue.put(new Patient(i, time));
            System.out.println("Пациент " + i + " (нужно " + time + " сек)");
        }

        Thread[] nursesThread = new Thread[nurses];
        for (int n = 1; n <= nurses; n++) {
            final int nurseId = n;
            nursesThread[n-1] = new Thread(() -> {
                try {
                    while (true) {
                        Patient p = queue.poll();
                        if (p == null) {
                            if (servedCount.get() >= patient) break;
                            Thread.sleep(100);
                            continue;
                        }
                        System.out.println("Медсестра " + nurseId + " начала с пациентом " + p.id + " (на " + p.serviceTime + " сек)");
                        Thread.sleep(p.serviceTime * 1000L);
                        servedCount.incrementAndGet();
                        System.out.println("Медсестра " + nurseId + " закончила с пациентом " + p.id);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            nursesThread[n-1].start();
        }

        while (servedCount.get() < patient) {
            Thread.sleep(500);
        }

        for (Thread t : nursesThread) {
            t.interrupt();
            t.join();
        }

        System.out.println("Все пациенты обслужены. Программа завершена.");
    }
}
