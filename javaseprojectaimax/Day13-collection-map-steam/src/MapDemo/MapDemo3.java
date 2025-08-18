package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        //目标：掌握Map集合的遍历之一：键找组
        Map<String,Integer> map = new HashMap<>();
        map.put("刘备",23);
        map.put("刘备",24);
        map.put("关羽",24);
        map.put("张飞",25);
        map.put("赵云",26);
        map.put("小乔",18);
        System.out.println(map);

        //1.提取Map集合的全部键到一个Set集合中
        Set<String> keys = map.keySet();

        //2.遍历Set集合，得到每一个键
        for (String key : keys) {
            //3.根据键去找值
            Integer value = map.get(key);
            System.out.println(key + ":" + value);
        }

    }
}
