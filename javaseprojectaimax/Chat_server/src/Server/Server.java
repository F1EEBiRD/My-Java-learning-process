package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
    //定义一个集合容器初春所有登录进来的客户端管道，以便奖励啊群发消息给他们。
    //定义一个Map集合，键是储存客户端的管道，值是这个管道的用户名称
    public static final Map<Socket, String> onLineSockets = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("服务器启动...");
        //注册端口
        try {
            ServerSocket serverSocket = new ServerSocket(Constant.PORT);
            //2.主线程负责接受客户端的连接请求
            while (true) {
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();
                //3.创建一个线程，把socket对象交给这个线程，以便支持很多客户端可以同时进行通信
                new ServerReaderThread(socket).start();
                System.out.println("一个客户端连接了");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
