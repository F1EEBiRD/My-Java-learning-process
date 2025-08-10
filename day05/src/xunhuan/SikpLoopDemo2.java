package xunhuan;

public class SikpLoopDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("今天是努力学习的第" + i + "天");
            if (i == 5) {
                //结束整个循环
                break;
            }
        }
    }
}
