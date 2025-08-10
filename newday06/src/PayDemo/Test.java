package PayDemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：加油站支付小程序
        //1.创建卡片类。以便创建金卡或银卡对象，封装车主信息
        //2.定义一个卡片父类：card，定义金卡和银卡的共同属性和方法
        //3.创建金卡和银卡子类继承卡片类，继承card类，金卡必须重写消费方式（8折），独有功能打印洗车卷
        //4.办一张金卡，创建金卡对象，交给一个独立的业务（支付机），模拟存款和消费
        GoldCard goldCard = new GoldCard("沪DHU008", "张三", "13888888888", 5000);
        goldCard.depositMoney(1000);
        pay(goldCard);
        //4.办一张银卡，创建金卡对象，交给一个独立的业务（支付机），模拟存款和消费
        SilvercCard silvercCard = new SilvercCard("沪DHU009", "李四", "13888888889", 2000);
        pay(silvercCard);
    }

    //支付机：用一个方法来刷卡:即可能接收金卡对象，也可能接收银卡对象
    public static void pay(Card c) {
        System.out.println("请刷卡,请输入当前消费金额");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.payMoney(money);


    }
}
