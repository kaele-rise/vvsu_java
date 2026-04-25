package lab12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.net.Socket;

public class TextReader {
    private int serverPort;
    private String serverAddress;


    public TextReader() {
        serverAddress = "localhost";
        serverPort = 4444;
    }

    public String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла" + e.getMessage());
        }
        return content.toString();
    }

    public String filterText(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (!Character.UnicodeBlock.of(c).equals(Character.UnicodeBlock.CYRILLIC)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public void sendEngText(String fileName) {
        String originalText = readFile(fileName);
        String filteredText = filterText(originalText);

        try (Socket socket = new Socket(serverAddress, serverPort);
             PrintWriter out = new PrintWriter(
                     new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8),
                     true)) {

            out.println(filteredText);
        } catch (IOException e) {
            System.err.println("Ошибка при отправке" + e.getMessage());
        }
    }
}
