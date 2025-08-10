package homework;

public class work3 {
    public static void main(String[] args) {
        int yu = 24;
        int hs = 8;
        int mi =3;
        System.out.println(yu+hs+mi);
        int money =yu + hs + mi;
        System.out.println("原价为：" + money);
        int money2 = money > 30 ? money : 30 ;
        System.out.println("打折支付：" + money2 *0.8);
        int money3 =16 + hs + mi;
        System.out.println("使用优惠：" + money3);
        int self = money2 > money ? money2 : money3;
        System.out.println("实际支付：" + self);

   }
}
