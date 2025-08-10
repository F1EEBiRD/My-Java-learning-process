package homework;

public class work8 {
    public static void main(String[] args) {
        //2019年是猪年，目标：查出1949年到2019年中所有是猪年的年份。
        //循环开始是1949年，结束是2019年
        for (int i = 1949; i <= 2019; i++)
            //2019-年份的差值是12的倍数，那么这一年就是猪年
            if ((2019 - i) % 12 == 0) {
                System.out.println(i);
            }
    }
}
