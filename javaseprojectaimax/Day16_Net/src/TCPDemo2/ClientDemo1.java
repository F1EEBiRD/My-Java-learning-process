package TCPDemo2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动...");
        //目标：实现TCP通讯多发多收：客户端开发
        //1.常见socket管道对象，请求与服务器的socket链接。可靠连接
        Socket socket = new Socket(InetAddress.getLocalHost(), 10086);

        //2.从Socket通信管道中得到一个字节输入流
        OutputStream os = socket.getOutputStream();

        //3.特殊数据流
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的内容：");
            String msg = sc.nextLine();
            if ("exit".equals(msg)) {
                System.out.println("===客户端退出===");
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
