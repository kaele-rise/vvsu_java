package lab12;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ChatServer {
    private int port;

    public ChatServer() {
        this.port = 4444;
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            Socket socket = serverSocket.accept();

            Thread receiver = new Thread(() -> {
                try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8))) {
                    String message;
                    while ((message = in.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            });
            receiver.start();

            try (PrintWriter out = new PrintWriter(
                    new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
                 BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {

                String line;
                while ((line = console.readLine()) != null) {
                    out.println(line);
                }
            }
            socket.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
