package lab12;

public class testChat {
    public static void main(String[] args) {
        new Thread(() -> new ChatServer().start()).start();

        try { Thread.sleep(500); } catch (InterruptedException ignored) {}

        new ChatClient().start();
    }
}