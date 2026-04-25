package lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class TextContainer {
    private static final List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Thread sorter = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    break;
                }
                synchronized (list) {
                    Collections.sort(list);
                    System.out.println("Список отсортирован");
                }
            }
        });
        sorter.start();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                sorter.interrupt();
                break;
            }
            synchronized (list) {
                list.add(input);
            }
        }

        try {
            sorter.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        synchronized (list) {
            for (int i = 0; i < list.size(); i++) System.out.println(i + ": " + list.get(i));
        }
        scanner.close();
    }
}