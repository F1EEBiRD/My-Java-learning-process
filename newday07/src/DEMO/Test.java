package DEMO;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：面向对象编程实现智能家居控制系统
        //角色：设备（吊灯，电视机，洗衣机，落地窗，.......)
        //具备的功能：开和管
        //谁控制他们：只能控制系统（单例对象）
        //1.定义设备类：创建设备对象代表家中设备。
        //2.准备这些设备对象，放到数组中，代表整个家庭的设备。
        JD[]  jds= new JD[4];
        jds[0] = new Lamp("小米吊灯",true);
        jds[1] = new WashMachine("美的洗衣机",true);
        jds[2] = new TV("Philips电视机",true);
        jds[3] = new AirMachine("美的空调",true);

        //3.为每个设备创建一个控制对象，并调用控制方法（开关），定义一个接口，让JD实现开和关
        //4.创建智能控制系统对象，控制设备的开和关
        SmartHomeControl SHC = SmartHomeControl.getInstance();//调取方法
        //5.控制电视机
        //SHC.control(jds[2]);

        //6.提示用户操作 a:展示全部设备的当前情况。 b：让用户选择设备进行操作。
        //打印全部设备的情况（开和关）
        while (true) {
            System.out.println("=====================");
            SHC.printAllStatus(jds);
            System.out.println("请选择要控制的设备：");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice){
                case "1" :
                SHC.control(jds[0]);
                break;
                case "2" :
                SHC.control(jds[1]);
                break;
                case "3" :
                SHC.control(jds[2]);
                break;
                case "4" :
                SHC.control(jds[3]);
                break;
                case "exit" :
                    System.out.println("退出APP");
                    return;
                default:
                    System.out.println("输入错误！,请重新输入");
            }
        }
    }
}
