package TCPDemo3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ServerReader extends Thread {
    private Socket socket;
    public ServerReader(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        //读取管道的消息
        //3.从socket管道中获取一个字节输入流
        try {
            InputStream is = socket.getInputStream();
            //4.把字节输入流转换成特殊数据输入流
            DataInputStream dis = new DataInputStream(is);
            //5.读取数据
            while (true) {
                String msg = dis.readUTF();//等待收取消息
                System.out.println(" msg:" + msg);
                //6.获取客户端的IP和端口（谁给我发的）
                System.out.println("客户端的IP:" + socket.getInetAddress().getHostAddress());
                System.out.println("客户端的端口:" + socket.getPort());
                System.out.println("=========================");
            }
        } catch (Exception e) {
            System.out.println("客户端下线了" + socket.getInetAddress().getHostAddress());
        }
    }

}
