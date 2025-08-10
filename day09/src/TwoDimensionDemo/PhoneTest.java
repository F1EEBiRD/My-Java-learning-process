package TwoDimensionDemo;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        phone p = new phone();

        p.brand = "小米";
        p.price = 1999.98;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法即可
        p.call();
        p.playgame();

        phone p2 = new phone();

        p2.brand = "苹果";
        p2.price = 8999;

        //获取手机对象中的值
        System.out.println(p2.brand);
        System.out.println(p2.price);

        //调用手机中的方法即可
        p2.call();
        p2.playgame();



    }
}
