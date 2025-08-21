package ApiDemo2;

public class Demo2 {
    public static void main(String[] args) {
        //目标：搞清楚Thread类中的sleep()方法。(线程休眠)
        for (int i = 0; i < 10; i++) {
            System.out.println("线程1：" + i);
            try {
                //让当前执行的线程进入休眠，直到时间到了，才会继续执行
                //场景：加上这行代码，如果交钱了，就注释掉
                Thread.sleep(1000);// 1000ms = 1s
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
