package xunhuan;

public class skip7loopdemo {
    public static void main(String[] args) {
        //逢7过，1 获取1-100的每一个数字
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过！");
                continue;

            }
            System.out.println(i);

        }
    }
}
