package ws.socket.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Administrator
 */
public class MySocketClient {
    public static void main(String[] args) throws IOException {

        String host = "192.168.9.174";
        int port = 8888;
        Socket socket = new Socket(host, port);
        String message = "nihaoa";
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write(message.getBytes("UTF-8"));
        outputStream.close();
        socket.close();

    }
}
