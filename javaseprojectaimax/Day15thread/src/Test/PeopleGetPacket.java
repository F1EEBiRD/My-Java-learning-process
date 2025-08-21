package Test;

import java.util.List;

public class PeopleGetPacket extends Thread{
    private List<Integer> redPacket;

    public PeopleGetPacket(List<Integer> redPacket, String name) {
        super(name);
        this.redPacket = redPacket;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        //100个人来抢redPacket集合中的钱
        while (true) {
            synchronized (redPacket){
                if (redPacket.size() == 0){
                    break;
                }
                //随机一个索引得到红包
                int index = (int)(Math.random()*redPacket.size());
                Integer money = redPacket.remove(index);
                System.out.println(name+ "抢到红包，金额为：" +money + "元");
                if (redPacket.size() == 0){
                    System.out.println("活动已结束！");
                    break;
                }
            }
/*            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }*/
        }
    }
}

