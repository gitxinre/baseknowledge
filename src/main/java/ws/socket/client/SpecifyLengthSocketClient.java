package ws.socket.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Administrator
 */
public class SpecifyLengthSocketClient {
    public static void main(String[] args) throws IOException {
        String host = "192.168.9.174";
        int port = 8889;
        Socket socket = new Socket(host, port);

        OutputStream outputStream = socket.getOutputStream();
        String message = "yfclient nihaoa";
        byte[] bytes = message.getBytes("UTF-8");
        // 前两个字节优先把消息的长度发送出去
        //outputStream.write(bytes.length >> 12);
        outputStream.write(bytes.length);
        System.out.println("bytes.length = " + bytes.length);
        // 发送具体的消息
        outputStream.write(bytes);
        /*outputStream.flush();
        // 发送第二条消息
        String message2 = "第二条消息";
        byte[] bytes2 = message2.getBytes("UTF-8");
        outputStream.write(bytes2.length >> 8);
        outputStream.write(bytes2.length);
        outputStream.write(bytes2);
        outputStream.flush();


        String message3 = "此处重复发送一次，实际项目中为多个命名，此处只为展示用法";
        byte[] bytes3 = message3.getBytes("UTF-8");
        outputStream.write(bytes3.length >> 8);
        outputStream.write(bytes3.length);
        outputStream.write(bytes3);*/

        outputStream.close();
        socket.close();
    }
}
