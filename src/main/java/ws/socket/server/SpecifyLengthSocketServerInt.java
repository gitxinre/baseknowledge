package ws.socket.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Administrator
 */
public class SpecifyLengthSocketServerInt {
    public static void main(String[] args) throws IOException {
        int port = 8889;
        ServerSocket server = new ServerSocket(port);
        Socket socket = server.accept();
        InputStream inputStream = socket.getInputStream();

        // 读取定长头存储的数据长度
        // int 类型占4个字节（byte）
        byte[] bytes = new byte[4];
        inputStream.read(bytes);
        int len = bytearrayToInt(bytes);

        System.out.println("len = " + len);
        byte[] data = new byte[len];
        inputStream.read(data);

        System.out.println("SpecifyLengthSocketServerInt get message from client :" + new String(data, "UTF-8"));


    }

    private static int bytearrayToInt(byte[] bytes) {
        int result = 0;
        for (int i = 0, len=bytes.length; i < len; i++) {
            result += bytes[i] << ((len - 1 - i) * 8);
        }
        return result;
    }
}
