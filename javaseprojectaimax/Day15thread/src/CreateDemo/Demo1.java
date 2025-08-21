package CreateDemo;

public class Demo1 {
    //
    public static void main(String[] args) {
        //目标：认识多线程，掌握创造线程的方法:继承Thread类来实现
        //不要把主线程任务放在启动子线程之前
        //4.创造线程类的对象：代表线程。
        Thread t1 = new MyThread();
        //5.调用start方法启动线程，还是用run方法执行
        t1.start();//启动线程，调用run方法

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程：" + i);
        }
    }
}

//1 定义一个子类继承Thread类，成为一个线程类
class MyThread extends Thread{
    //2 重写Thread类的run方法
    @Override
    public void run() {
        //3.在run方法中编写线程要执行的任务
        for (int i = 0; i < 5; i++) {
            System.out.println("线程1：" + i);
        }
    }
}
