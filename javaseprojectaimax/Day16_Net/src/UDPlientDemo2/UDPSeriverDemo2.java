package UDPlientDemo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPSeriverDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("===服务端启动===");
        //目标：完成UDP通信多发多收，服务端开发
        //1.创建接收端对象,注册端口（接菜的人）
        DatagramSocket socket = new DatagramSocket(8080) ;
        //2.创建数据包对象，封装接收数据(准备一个盘子)
        byte[] bytes = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        while (true) {
            //3.调用方法接收数据，将数据封装到数据包对象中的字节数组中去
            socket.receive(packet);//等待接收数据

            //4.看数据是否收到
            int length = packet.getLength(); //获取当前对象收到的数据长度。
            String data = new String(bytes, 0, length);
            System.out.println("收到数据：" + data);

            //5.获取对方的ip对象
            String ip = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println("对方ip：" + ip + "对方端口：" +"  " + port);

            System.out.println("------------------------------------------");
        }
    }
}
