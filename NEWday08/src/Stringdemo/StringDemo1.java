package Stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //目标：掌握创建字符串对象，封装要处理的字符串数据，调用String类的方法处理字符串
        //1.推荐方式一：直接“”就可以创建字符串，封装字符串数据。
        String name = "Tom";
        System.out.println(name);
        System.out.println(name.length());//处理字符串的方法

        //2.方式二：通过构造器初始化对象
        String name2 = new String();//相当于“ ”不推荐
        System.out.println(name2);//“”空字符串

        String name3 = new String("Tom");
        System.out.println(name3);

        char[] chars = {'T', 'o', 'm'};
        String name4 = new String(chars);
        System.out.println(name4);

        byte[] bytes = {97, 98, 99, 65, 66, 67};//97=a 65=A
        String name5 = new String(bytes);
        System.out.println(name5);


        System.out.println("============================================");
        //只有“”给出的字符串对象放在字符串常量池，相同内容只放一个
        String T1 = "hello";
        String T2 = "hello";
        System.out.println(T1 == T2);

        String T3 = new String("hello");
        String T4 = new String("hello");
        System.out.println(T3 == T4);

        System.out.println("============================================");
        //调用字符串的方法，处理字符串数据
        //简单版的登录：
        String okLoginName = "admin";

        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String loginName = sc.next();

        //字符串对象的内容比较，千万不要用==，==默认比较地址，字符串对象的内容一样时地址不一样
        //判断字符串内容，建议用equals方法，只关心字符串内容，不关心地址，一样就返回 true
        if(loginName.equals("admin")){
            System.out.println("登录成功！");
        }else {
            System.out.println("登录失败！");
        }

        System.out.println("============================================");
        // 1234567890 ==>123***7890
        System.out.println("请您用手机号登录:");
        String phone = sc.next();

        System.out.println("系统显示以下手机号进入：");
        System.out.println(phone.substring(0,3)+"***"+phone.substring(7));

    }
}
