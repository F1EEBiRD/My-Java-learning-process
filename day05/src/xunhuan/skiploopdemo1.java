package xunhuan;

public class skiploopdemo1 {
    public static void main(String[] args) {
        //1 跳过某一次循环
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                //设置跳过第几次，继续下一次循环
                continue;
            }
            System.out.println("今天是努力学习的第" + i + "天");
        }
    }
}
