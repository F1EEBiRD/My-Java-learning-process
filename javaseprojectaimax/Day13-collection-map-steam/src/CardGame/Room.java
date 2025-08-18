package CardGame;

import java.util.*;

public class Room {
    //1.准备好54张牌，给房间使用：定义一个集合容器来装54张牌。
    private List<Card> allcards = new ArrayList<>();
    {
    //2.初始化54张牌进入房间：

    //3.准备点数
    String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2",};
     //4.准备花色
    String[] colors = {"♥","♠","♣","♦"};
    //5.组合点数和花色成为牌对象，加入到集合中去
    int num = 0;
    for (String size : sizes) {
        num++;
        for (String color : colors){
            //6.创建字符串
            Card card = new Card(size,color,num);
            //7.添加到集合中
            allcards.add(card);
        }
    }
    //添加大小王
        //allcards.add(new Card(" ","🃏"));
        //allcards.add(new Card(" ","👲"));
        Collections.addAll(allcards,new Card(" ","🃏",++num),new Card(" ","👲",num++));
        System.out.println("新牌是：" + allcards);
}

    public void start(){
        //8.洗牌，随机打乱集合中的顺序
        Collections.shuffle(allcards);
        System.out.println("洗牌后：" + allcards);

        //9.发牌:定义三个玩家：刘备 = [],张飞 = [],关羽 = []
        Map<String,List<Card>> players = new HashMap<>();
        List<Card> lb = new ArrayList<>();
        players.put("刘备",lb);

        List<Card> zf = new ArrayList<>();
        players.put("张飞",zf);

        List<Card> gy = new ArrayList<>();
        players.put("关羽",gy);

        //allCards = [54张牌]
        //只发出51张：0 1 2 3 4 5 6 7。。。。
        for (int i = 0; i < allcards.size() - 3; i++) {
            //获取到当前遍历的牌
            Card card = allcards.get(i);
            //判断当前这张牌发给谁
            if (i % 3 == 0) {
                //给刘备发
                lb.add(card);
            }else if (i % 3 == 1) {
                //给关羽发
                zf.add(card);
            }else {
                //给张飞发
                gy.add(card);
            }
        }
        //10.拿最后三张底牌
        List<Card> lastCards = allcards.subList(allcards.size() - 3, allcards.size());
        System.out.println("底牌：" + lastCards);

        //11.抢地主：把底牌给抢地主的人
        lb.addAll(lastCards);

        //12.给每个玩家现在的手牌按size进行排序
        //List<Card> lb = [[9♥, 8♥, A♥, 9♣, 8♠, 3♣, 7♠, Q♦, 10♠, 7♣, K♠, 10♣, 8♣, J♠, 2♦, Q♠,  🃏, 2♣, 5♣,  👲]
        sortCards(lb);
        sortCards(zf);
        sortCards(gy);


        //13.看牌，遍历map集合
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            //获取玩家名称
            String name = entry.getKey();
            //获取玩家牌
            List<Card> cards = entry.getValue();
            //遍历玩家牌
            System.out.println(name + "的手牌是" + cards);
        }
    }
    //写个方法，将牌按照牌面大小进行排序
    private void sortCards(List<Card> cards) {
        Collections.sort(cards, (o1, o2) -> o2.getNum() - o1.getNum());
    }

}
