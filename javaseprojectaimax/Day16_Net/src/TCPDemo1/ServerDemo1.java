package TCPDemo1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public static void main(String[] args)  throws Exception{
        System.out.println("===服务器启动===");
            //目标：实现TCP通讯一发一收：服务器开发
            //1.创建一个服务器Socket对象，绑定监听端口
            ServerSocket ss = new ServerSocket(10086);
            //2.调用accept方法，堵塞式等待客户端链接，一旦有一个客户端链接，方法会返回一个Socket对象，通过Socket对象获取输入流
            Socket socket = ss.accept();
            //3.从socket管道中获取一个字节输入流
            InputStream is = socket.getInputStream();
            //4.把字节输入流转换成特殊数据输入流
            DataInputStream dis = new DataInputStream(is);
            //5.读取数据
            int id = dis.readInt();
            String msg = dis.readUTF();
            System.out.println("id:" + id + " msg:" + msg);
            //6.获取客户端的IP和端口（谁给我发的）
            System.out.println("客户端的IP:" + socket.getInetAddress().getHostAddress());
            System.out.println("客户端的端口:" + socket.getPort());

        }
    }

