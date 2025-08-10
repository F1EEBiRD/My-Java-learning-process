package Test2;

public class test3 {
    public static void main(String[] args) {
        //1.定义三个变量记录三个身高
        //2.拿第一个和第二个比较
        int num1 = 150;
        int num2 = 210;
        int num3 = 165;
        int temp = num1 > num2 ? num1 : num2;
        int max = temp > num3 ? temp : num3;
        //ctrl + alt + l
        System.out.println(max);
    }

}
