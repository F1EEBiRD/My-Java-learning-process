package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args)
    {

    //目标：掌握Map集合的遍历之二：键值对
    Map<String,Integer> map = new HashMap<>();
        map.put("刘备",23);
        map.put("刘备",24);
        map.put("关羽",24);
        map.put("张飞",25);
        map.put("赵云",26);
        map.put("小乔",18);
        System.out.println(map);

        //1.把Map集合转换成Set集合，里面的元素都是键值对对象Entry
        /**
         * map = { "刘备":23, "关羽":24, "张飞":25, "赵云":26, "小乔":18 }
         * ↓
         * map.entrySet()
         *↓
         * Set<Map.Entry<String, Integer>> entries = [（刘备= 23） （关羽= 24） （张飞= 25） （赵云= 26） （小乔= 18）]
         */
        Set<Map.Entry<String, Integer>> entries = map.entrySet();


    }
}
