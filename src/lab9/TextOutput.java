package lab9;

public class TextOutput implements Runnable {
    String text;

    public TextOutput() {
        text = "";
    }

    public TextOutput(String text_) {
        text = text_;
    }

    private static synchronized void print(String text) {
        long threadId = Thread.currentThread().getId();
        System.out.println("Id: " + threadId);
        System.out.println(text);
        System.out.println();
    }

    public void run() {
        print(text);
    }
}
