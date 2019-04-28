package ws.socket.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Administrator
 */
public class MySocketServer {
    public static void main(String[] args) throws IOException {

        while (true) {
            int port = 8888;
            ServerSocket server = new ServerSocket(port);
            Socket socket = server.accept();

            /**
             * 建立好连接后，从socket中获取输入流，并建立缓冲区进行读取
             */
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();

            while ((len=inputStream.read(bytes)) != -1 ) {
                sb.append(new String(bytes, 0, len, "UTF-8"));
            }
            System.out.println("get message from client :" + sb.toString());
            inputStream.close();
            socket.close();
            server.close();
        }

    }
}
