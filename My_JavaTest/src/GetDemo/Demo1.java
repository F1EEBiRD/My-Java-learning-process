package GetDemo;

import java.util.ArrayList;

public class Demo1 {
    //小内部类：用于计算拿取的重量和价值
    static class Pick {
        String name;
        double takeWeight;
        double takeValue;

        Pick(String name, double takeWeight, double takeValue) {
            this.name = name;
            this.takeWeight = takeWeight;
            this.takeValue = takeValue;
        }

        @Override
        public String toString() {
            return name + " -> 取 " + takeWeight + " 升，价值 " + takeValue;
        }
    }

    public static void main(String[] args) {
        //现在有n个物品，每个物品都是液体，液体存在重量和价值，
        // 现在要求你只能从如下提供的液体中总共取走10升液体，
        // 每种液体每次可以不拿，全拿，或拿一部分，
        // 问取走的10升液体的最高价值是多少。

        //创建物品
        Item item1 = new Item("water", 24, 4.0);
        Item item2 = new Item("milk", 160, 8.0);
        Item item3 = new Item("Wuliangye", 4000, 2.0);
        Item item4 = new Item("cola", 108, 6.0);
        Item item5 = new Item("Maotai", 4000, 1.0);

        //创建物品列表
        ArrayList<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

        //计算单价
        /*for (Item item : items) {
            System.out.println(item);
        }*/

        // 按单价降序排列
        items.sort((a, b) -> Double.compare(b.getUnitPrice(), a.getUnitPrice()));

        //设置容器
        double CupSize = 10.0;//容器大小
        double CupPrice = 0.0;//容器内的价值
        //创建数组记录计算的数据
        ArrayList<Pick> picks = new ArrayList<>();

        for(Item item : items){
            if (CupSize <= 0) break;

            double take = Math.min(CupSize, item.getWeight());//一次拿取的量
            double gain = take * item.getUnitPrice(); //单价 = 总价值 / 重量

            CupPrice += gain;
            CupSize -= take;

            //记录一次取得的结果
            picks.add(new Pick(item.getName(), take, gain));

            for (Pick p : picks) {
                System.out.printf("%s -> 取 %.2f 升，价值 %.2f%n", p.name, p.takeWeight, p.takeValue);
            }
        }
        System.out.printf("最大总价值：%.2f%n", CupPrice);
    }
}
