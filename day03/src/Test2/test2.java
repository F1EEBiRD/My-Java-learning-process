package Test2;


import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int weight2 = sc.nextInt();
        //用三元运算符判断相同或不同
        String result = weight1 == weight2 ? "两只老虎体重相同" : "两只老虎体重不同";
        System.out.println(result);
    }
}
