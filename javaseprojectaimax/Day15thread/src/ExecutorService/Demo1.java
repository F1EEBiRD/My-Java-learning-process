package ExecutorService;

import java.util.concurrent.*;

public class Demo1 {
    public static void main(String[] args) {
        //目标：创建线程池对象来使用
        //1.使用线程池的实现类ThreadPoolExecutor声明七个参数来创建线程池对象
        ExecutorService pool= new ThreadPoolExecutor(
                3,
                5,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        //使用线程池处理任务！看会不会复用线程？
        Runnable target = new MyRunnable();
        pool.execute(target);//提交第一个任务：创建一个线程对象，并自动启动线程，执行任务！
        pool.execute(target);//提交第二个任务
        pool.execute(target);//提交第三个任务
        pool.execute(target);//复用线程
        pool.execute(target);//复用线程
        pool.execute(target);//复用线程
        pool.execute(target);//复用线程
        pool.execute(target);//复用线程
        pool.execute(target);//到了拒绝策略，会创建一个新线程，执行任务！


        //3.关闭线程池
        //pool.shutdown();//线程池不会再接受新的任务，但会等待已经提交的任务执行完成！
        //pool.shutdownNow();//线程池不再接受新的任务，并立即关闭！



    }
}
