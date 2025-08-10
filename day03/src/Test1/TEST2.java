package Test1;

import java.util.Scanner;

public class TEST2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我们自己衣服的时髦度：");
        int myfashion = sc.nextInt();
        System.out.println("请输入相亲对象的时髦度：");
        int girlfashion = sc.nextInt();
        boolean result = myfashion > girlfashion;
        System.out.println(result);

    }
}
