package CreateDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableDemo3 {
    public static void main(String[] args) {
        //目标：掌握多线程的创建方式三：实现Callable接口，方式三的又是，可以获取线程执行结果
        //3.创建一个Callable接口的实现类对象
        Callable <String> c1 = new MyCallable(100);
        //4.把Callable对象封装成一个真正的线程任务对象FutureTask对象
        /**
         * 未来任务对象的作用？
         * a.本质是一个Runnable线程任务对象，可以交给Thread线程对象处理
         * b.可以获取线程执行结果
         */
        FutureTask<String> f1 = new FutureTask<>(c1);//public FutureTask(Callable<V> callable)
        //5.把FutureTask对象作为参数传递给Thread类的构造方法，创建Thread类的对象，即创建线程对象
        Thread t1 = new Thread(f1);
        //6.调用start方法启动线程
        t1.start();


        Callable<String> c2 = new MyCallable(50);
        FutureTask<String> f2 = new FutureTask<>(c2);
        Thread t2 = new Thread(f2);
        t2.start();

        //获取线程执行结果（分开tc，避免都异常）
        try {
            //如果主线程发现第一个线程执行结果未完成，则会让出cpu，等第一个线程执行完成，才会往下执行
            System.out.println(f1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(f2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

//1.定义一个实现类实现Callable接口
class MyCallable implements Callable<String> {
    private  int n;
    public MyCallable(int n) {
        this.n = n;
    }
    //2.实现call方法，定义线程执行体
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return "子线程1：" + n + "的累加和为" + sum;
    }
}
