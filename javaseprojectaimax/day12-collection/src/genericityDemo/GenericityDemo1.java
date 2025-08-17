package genericityDemo;

import java.util.ArrayList;

public class GenericityDemo1 {
    public static void main(String[] args) {
        // 目标：认识泛型，搞清楚使用泛型的好处
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        /*list.add(23);
        list.add(99.9);
        list.add(true);
        list.add('a');
        list.add(new Object());*/


        //获取数据
        for (int i = 0; i < list.size(); i++) {
 /*           Object obj = list.get(i);
            //把数据转型处理
            String s = (String) obj;
            System.out.println(s);*/
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
