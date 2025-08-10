package COM.BAOMIN;

public class arithmeticoperatordemo2 {
    public static void main(String[] args) {
        //除法
        //整数参与计算，结果只能得到整数
        //小数参与计算，结果有可能不精确，精确计算要等到后面的知识
        System.out.println(10 / 2);
        System.out.println(10 / 3);
        System.out.println(10.0 / 3);
        //取模，取余，实习也是做除法，只不过得到余数
        System.out.println(10 % 2);//0
        System.out.println(10 % 3);//1

        //应用场景：
        //1.可以用取模来判断，A是否可以被B整除
        //A % B  10 % 3
        //如果A % 2 , 如果结果为0，证明A是一个偶数。结果为1，a是奇数



    }
}
