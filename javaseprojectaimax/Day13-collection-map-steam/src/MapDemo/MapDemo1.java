package MapDemo;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
    //目标：认识map集合的特点。
   //1.创建Map集合
        //HashMap特点：无序，不重复，无索引，键值对都可以是null，值不做要求（可以重复）
        //LinkededHashMap特点：有序，不重复，无索引，键值对都可以是null，值不做要求（可以重复）
        //TreeMap特点：排序，不重复，无索引，键值对都可以是null，值不做要求（可以重复）
        //Map<String,Integer> map = new HashMap<>();//经典代码
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("刘备",23);
        map.put("刘备",24);
        map.put("关羽",24);
        map.put("张飞",25);
        map.put("赵云",26);
        map.put("小乔",18);
        map.put(null,null);
        System.out.println(map);

        //写代码演示常用方法
        System.out.println(map.get("关羽"));//24
        System.out.println(map.get("关羽2"));// null

        System.out.println(map.containsKey("关羽"));//判断是否包含某个值 true
        System.out.println(map.containsValue(24.0));//fales

        System.out.println(map.isEmpty());//判断是否为空

        System.out.println(map.size());//获取键值的个数 3

        //获取所有的值放到一个Set集合返回给我们
        Set<String> keys = map.keySet();//获取所有的键
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }

        //获取所有的值放到一个Collection集合返回给我们
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
