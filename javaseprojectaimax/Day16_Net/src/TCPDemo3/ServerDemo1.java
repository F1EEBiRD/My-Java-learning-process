package TCPDemo3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public static void main(String[] args)  throws Exception{
        System.out.println("===服务器启动===");
            //目标：实现TCP通讯与多个客户端同时通讯
            //1.创建一个服务器Socket对象，绑定监听端口
            ServerSocket ss = new ServerSocket(10086);
            //2.调用accept方法，堵塞式等待客户端链接，一旦有一个客户端链接，方法会返回一个Socket对象，通过Socket对象获取输入流
        while (true) {
            //2.调用accept方法，堵塞式等待客户端链接，一旦有一个客户端链接，方法会返回一个Socket对象，通过Socket对象获取输入流
            Socket socket = ss.accept();
            System.out.println("一个客户端连接了" + socket.getInetAddress().getHostAddress());
            //3.把这个客户端管道交给一个独立的子线程专门负责接收这个管道的消息
            new ServerReader(socket).start();
        }

    }
}

