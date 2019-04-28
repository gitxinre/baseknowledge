package ws.socket.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Administrator
 */
public class TwoWayCommunicationSocketClient {

    public static void main(String[] args) throws IOException {
        String host = "192.168.9.174";
        int port = 8889;
        Socket socket = new Socket(host, port);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("client nihaoa".getBytes("UTF-8"));


        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        StringBuilder sb = new StringBuilder();
        while ((len = inputStream.read(bytes)) != -1) {
            sb.append(new String(bytes, 0, len, "UTF-8"));
        }
        System.out.println("get message from server :" + sb.toString());
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
