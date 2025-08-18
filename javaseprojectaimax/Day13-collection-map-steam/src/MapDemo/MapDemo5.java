package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo5 {
    public static void main(String[] args) {
        //目标：掌握Map集合的遍历之三：Lambda表达式
        Map<String,Integer> map = new HashMap<>();
        map.put("刘备",23);
        map.put("刘备",24);
        map.put("关羽",24);
        map.put("张飞",25);
        map.put("赵云",26);
        map.put("小乔",18);
        System.out.println(map);

        //1.直接调用Map集合的forEach方法
        map.forEach((k,v)->{});

    }
}


