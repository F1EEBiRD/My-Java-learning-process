package CreateDemo;

public class Demo2 {
    public static void main(String[] args) {
        //目标：认识多线程，掌握创造线程的方法:实现Runnable接口来实现
        //3.创建线程任务类对象代表一个线程任务
        MyRunnable r = new MyRunnable();
        //4.把线程任务对象作为参数传递给Thread类的构造方法，创建Thread类的对象，即创建线程对象
        //Thread t1 = new Thread(r, "线程1");//public Thread(Runnable r)
        Thread t1 = new Thread(r, "线程1");//public Thread(Runnable r,String name)

        //5.调用start方法启动线程
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程：" + i);
        }
    }
}

//1.定义一个线程类，继承Runnable接口
//Runnable优点：可以继续继承其他类
class MyRunnable implements Runnable{
    //2.重写run方法，设置线程任务
    @Override
    public void run() {
        //线程任务
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程1：" + i);
        }
    }

}
