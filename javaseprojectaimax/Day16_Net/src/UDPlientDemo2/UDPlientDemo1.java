package UDPlientDemo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPlientDemo1 {
    public static void main(String[] args) throws  Exception{
        System.out.println("===UDP客户端启动===");
        //目标：完成UDP通讯多发多收，客户端开发
        //1.创建发送端对象（送菜的人）
        DatagramSocket socket = new DatagramSocket() ;
        //2.创建数据包对象封装要发送的数据（送的菜）
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的数据：");
            String msg = sc.nextLine();//你好 在干嘛？
            //如果用户输入的是exit，则退出
            if ("exit".equals(msg)) {
                System.out.println("===UDP客户端退出===");
                socket.close();
                break;
            }
            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket( bytes, bytes.length, InetAddress.getLocalHost(), 8080);

            //3.让发送端发送数据
            socket.send(packet);

            socket.close();
        }

    }
}
