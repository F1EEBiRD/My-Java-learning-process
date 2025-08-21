package ApiDemo2;

public class Demo1 {
    //
    public static void main(String[] args) {
        //目标：线程的常用方法
        Thread t1 = new MyThread("1号线程");
        //设置线程名需要在启动之前
        //t1.setName("线程1");
        t1.start();
        System.out.println("t1.getName() = " + t1.getName());//默认名：Thread-索引

        Thread t2 = new MyThread("2号线程");
        //t2.setName("线程2");
        t2.start();
        System.out.println("t2.getName() = " + t2.getName());

        //哪个线程调用这个代码，这个代码就拿到哪个线程
        Thread m = Thread.currentThread();
        m.setName("主线程");
        System.out.println("m.getName() = " + m.getName());


       /* for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }*/
    }
}

//1 定义一个子类继承Thread类，成为一个线程类
class MyThread extends Thread{
    //通过有参数构造方法，设置线程名
    public MyThread(String name) {
        super(name);//public Thread(String name)
    }

    //2 重写Thread类的run方法
    @Override
    public void run() {
        //3.在run方法中编写线程要执行的任务
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "子线程输出：" + i);
        }
    }
}
