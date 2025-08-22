package TCPDemo4;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerDemo {
    public static void main(String[] args)  throws Exception{
        System.out.println("===服务器启动===");
            //目标：BS架构的原理理解
            //1.创建一个服务器Socket对象，绑定监听端口
            ServerSocket ss = new ServerSocket(8080);

            //创建线程池
        ExecutorService pool = new ThreadPoolExecutor(3,10,10, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(100), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        while (true) {
            //2.调用accept方法，堵塞式等待客户端链接，一旦有一个客户端链接，方法会返回一个Socket对象，通过Socket对象获取输入流
            Socket socket = ss.accept();
            System.out.println("一个客户端连接了" + socket.getInetAddress().getHostAddress());
            //3.把这个客户端管道交给一个任务交给线程池处理
            pool.execute(new ServerReader(socket));

        }

    }
}

