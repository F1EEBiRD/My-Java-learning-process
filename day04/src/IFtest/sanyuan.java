package IFtest;

import java.util.Scanner;

public class sanyuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score = sc.nextInt();
        //对异常数据进行判断
        //0-100为合理数据
        if (score >= 95 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 90 && score <= 94) {
            System.out.println("良好");
        } else if (score >= 80 && score <= 89) {
            System.out.println("中");
        } else if (score >= 70 && score <= 79) {
            System.out.println("及格");
        } else {
            System.out.println("目前成绩不合法");
        }

}
}
