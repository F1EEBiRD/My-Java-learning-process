package UDPlientDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPlientDemo1 {
    public static void main(String[] args) throws  Exception{
        System.out.println("===UDP客户端启动===");
        //目标：完成UDP通讯一发一收，客户端开发
        //1.创建发送端对象（送菜的人）
        DatagramSocket socket = new DatagramSocket() ;
        //2.创建数据包对象封装要发送的数据（送的菜）
        byte[] bytes = "Hellow World".getBytes();
        /*
         * public DatagramPacket(byte[] buf, int length,
         *                           InetAddress address, int port)
         * 参数一：发送的数据，字节数组
         *参数二：发送的字节长度
         *参数三：目的地的ip地址
         *参数四：服务器程序的端口号
         */
        DatagramPacket packet = new DatagramPacket( bytes, bytes.length, InetAddress.getLocalHost(), 8080);

        //3.让发送端发送数据
        socket.send(packet);

    }
}
