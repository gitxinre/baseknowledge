package ws.socket.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Administrator
 */
public class TwoWayCommunicationSocketServer {

    public static void main(String[] args) throws IOException {

        while (true) {
            int port = 8889;
            ServerSocket server = new ServerSocket(port);
            Socket socket = server.accept();
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = inputStream.read(bytes)) != -1) {
                sb.append(new String(bytes, 0, len, "UTF-8"));
            }

            System.out.println("get message from client :" + sb.toString());


            // 开始向客户端发送消息
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("server".getBytes("UTF-8"));
            outputStream.close();
            inputStream.close();
            socket.close();
            server.close();

        }
    }
}
