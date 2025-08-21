package CreateDemo;

public class Demo2_2 {
    public static void main(String[] args) {
        //目标：使用Runnable接口的匿名内部类来创建
        //3.创建线程任务类对象代表一个线程任务
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程输出1：" + i);
                }
            }
        };
        //4.把线程任务对象作为参数传递给Thread类的构造方法，创建Thread类的对象，即创建线程对象
        Thread t1 = new Thread(r);//public Thread(Runnable r)
        t1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程输出2：" + i);
                }
            }
        }).start();

        new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程输出3：" + i);
                }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}

//1.定义一个线程类，继承Runnable接口
//Runnable优点：可以继续继承其他类



