package ApiDemo2;

public class Demo3 {
    public static void main(String[] args) {
        //目标：搞清楚线程join方法：线程插队：让调用这个方法线程先完毕。
        MyThread2 t1 = new MyThread2();
        t1.start();

        for (int i = 1; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "主线程输出：" + i);
            if (i == 1) {
                try {
                    t1.join();//插队 让t1线程先完毕，再继续执行主线程
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

    class MyThread2 extends Thread {
        //  重写Thread类的run方法
        @Override
        public void run() {
            //3.在run方法中编写线程要执行的任务
            for (int i = 1; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "子线程输出：" + i);
            }
        }
    }


