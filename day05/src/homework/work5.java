package homework;

public class work5 {
    public static void main(String[] args) {
        //定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。
        // 计算并输出学生的平均成绩。

        //定义保存学生成绩的数组arr。
        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        //定义变量sum用来存储和。
        int sum = 0;
        //对数组进行遍历
        for (int i = 0; i < arr.length; i++) {
            //求和
            sum += arr[i];
            //和除以元素个数得到平均数。
        }
        //和除以元素个数得到平均数。
        double avg = sum / arr.length;
        System.out.println("平均分为：" + avg);



    }
}
