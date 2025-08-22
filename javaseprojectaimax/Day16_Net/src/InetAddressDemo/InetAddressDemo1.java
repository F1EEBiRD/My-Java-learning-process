package InetAddressDemo;

import java.net.InetAddress;

public class InetAddressDemo1 {
    public static void main(String[] args) {
        //目标：认识InetAddress获取本机ip对象和对方ip对象
        try {
            //1.获取本机ip对象
            InetAddress ip1 = InetAddress.getLocalHost();
            System.out.println(ip1);
            System.out.println(ip1.getHostName());
            System.out.println(ip1.getHostAddress());

            //2.获取对方ip对象
            InetAddress ip2 = InetAddress.getByName("www.baidu.com");
            System.out.println(ip2.getHostName());
            System.out.println(ip2.getHostAddress());

            //3.判断主机与对方是否互通
            System.out.println(ip2.isReachable(5000));
        }catch (Exception e){
            e.printStackTrace();
        }




    }
}
