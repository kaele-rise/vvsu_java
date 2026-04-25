package lab12;

public class testText {
    public static void main(String[] args) {
        new Thread(() -> new TextReceiver().start()).start();

        try { Thread.sleep(100); } catch (InterruptedException ignored) {}

        new TextReader().sendEngText("src/lab12/text.txt");
    }
}
