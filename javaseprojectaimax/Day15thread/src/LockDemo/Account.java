package LockDemo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String cardId;//卡号
    private  double money;//金额
    private final Lock lk = new ReentrantLock();

    //小明和小红都到这里来取钱
    public  void drawMoney(double money) {
        //目标：线程同步的方式一演示：同步代码块
        //先拿到当前谁来取钱
        String name = Thread.currentThread().getName();
        lk.lock();//上锁
        //判断金额是否足够
        try {
            if (this.money >= money) {
                //金额足够，取钱
                System.out.println(name + "取钱成功，取钱金额：" + money + "元");
                //更新余额
                this.money -= money;
                System.out.println(name + "取钱成功，当前余额为：" + this.money + "元");
            }else{
                //余额不足
                System.out.println(name + "取钱失败，余额不足");
            }
        } finally {
            //解锁
            lk.unlock();
        }
    }
}

