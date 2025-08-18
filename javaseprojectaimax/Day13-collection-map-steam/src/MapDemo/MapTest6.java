package MapDemo;

import java.util.*;

public class MapTest6 {
    public static void main(String[] args) {
        //目标：使用Map集合相关案例：投票统计程序
        calc();
    }
    public static void calc() {
        //1.把80个学生选择的景点数据拿到程序中来，才可以统计。
        List<String> locations = new ArrayList<>();
        String[] names = {"黄鹤楼","天安门","少林寺","丽江"};
        Random r = new Random() ;
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(names.length);//0 1 2 3
            locations.add(names[index]);//随机创造出80个学生选择的景点
        }
        System.out.println(locations);

        //2.统计每个景点被选择的次数
        //最终统计的结果是一个键值对的形式，所以可以考虑定义一个Map集合来统计结果
        Map<String,Integer> map = new HashMap<>();//map = {}
        //System.out.println(map);//目前是空的

        //3.遍历80个学生景点选择信息，统计次数
        for (String location : locations) {
            //4.判断当前遍历的经典是否在Map集合中存在，如果不存在说明是第一次出现，如果存在说明之前统计过。
            /*if (map.containsKey(location)) {
                //这个景点出现过，值+1
                map.put(location,map.get(location) + 1);
            }else {
                //景点第一次出现，存入"景点 = 1"
                map.put(location,1);
            }*/
            //简化写法：先containsKey判断，如果存在，则get() + 1，如果不存在，则1
            map.put(location,map.containsKey(location)? map.get(location) + 1 : 1);
        }


    }
}
