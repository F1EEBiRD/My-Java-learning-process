package SilverGameDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SilverGame {
    public static void main(String[] args) {
        //目前有100名囚犯，每个囚犯的编号是1-200之间的随机数。
        // 现在要求依次随机生成100名囚犯的编号（要求这些囚犯的编号是不能重复的），然后让他们依次站成一排。
        // (注：位置是从1开始计数的)，接下来，国王命令手下先干掉全部奇数位置处的人。
        // 剩下的人，又从新按位置1开始，再次干掉全部奇数位置处的人，依此类推，直到最后剩下一个人为止，剩下的这个人为幸存者。

     /* **具体功能点的要求如下：**
        请输出幸存者的编号，以及他第一次所占的位置值是多少。*/

        //用洗牌法获得100个不重复编号（1-200之间）
        List<Integer> Prisoners = new ArrayList<>();
        for (int i = 1; i <= 200; i++) Prisoners.add(i);
        //随机生成100个不重复编号
        Collections.shuffle(Prisoners);
        List<Integer> line = Prisoners.subList(0, 100);//截取100个编号

        int n = line.size();
        int firstPos = Integer.highestOneBit(n);//取 ≤n 的最大 2 的幂：100 -> 64
        int survivorId = line.get(firstPos - 1);//获取幸存者编号

        System.out.println("幸存者编号：" + survivorId);
        System.out.println("第一次所占位置值：" + firstPos);

    }
}







