package ExecutorService;

//1.定义一个线程类，继承Runnable接口
//Runnable优点：可以继续继承其他类
class MyRunnable implements Runnable{
    //2.重写run方法，设置线程任务
    @Override
    public void run() {
        //线程任务
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出："  + i);
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
