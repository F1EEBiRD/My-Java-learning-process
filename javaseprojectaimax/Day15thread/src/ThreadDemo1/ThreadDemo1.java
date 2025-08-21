package ThreadDemo1;

import synchronized_code.Account;
import synchronized_code.DrawThread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //目标：模拟线程安全问题
        //1.设计一个账户类：用于创建小明和小红的共同账户对象，存入10万。
        Account acc = new Account("ICBC-001",1000000);

        //2.设计线程类：创建两个线程，模拟小明和小红同时去同一个账户取款10万。
        new DrawThread("小明",acc).start();
        new DrawThread("小红",acc).start();

        Account acc2 = new Account("ICBC-002",1000000);

        new DrawThread("小黑",acc2).start();
        new DrawThread("小白",acc2).start();




    }
}
