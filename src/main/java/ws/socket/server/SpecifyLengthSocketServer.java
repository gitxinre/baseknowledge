package ws.socket.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Administrator
 */
public class SpecifyLengthSocketServer {
    public static void main(String[] args) throws IOException {

        while (true) {
            int port = 8889;
            ServerSocket server = new ServerSocket(port);

            Socket socket = server.accept();

            InputStream inputStream = socket.getInputStream();
            byte[] bytes;
            //while (true) {
                int first = inputStream.read();
                if (first == -1) {
                    //break;
                }
                int second = inputStream.read();
                int len = first << 8 + second;
                bytes = new byte[len];
                inputStream.read(bytes);
                System.out.println("get message from client :" + new String(bytes, "UTF-8"));
            //}
            inputStream.close();
            socket.close();
            server.close();
        }
    }
}
