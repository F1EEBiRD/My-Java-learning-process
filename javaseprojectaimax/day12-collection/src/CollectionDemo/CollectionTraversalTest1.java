package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalTest1 {
    public static void main(String[] args) {
        // 目标：认识并发修改异常问题，搞清楚每种遍历区别
        ArrayList<String> names = new ArrayList<>();
        names.add("宁夏枸杞");
        names.add("黑枸杞");
        names.add("拖鞋");
        names.add("西洋参");
        names.add("枸杞子");

        //需求1：删除全部枸杞
       /* for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (name.contains("枸杞")) {
                names.remove(name);
            }
        }*/
        //System.out.println(names);//会导致没删干净，因为每删一个下一个会补位上来，遍历的时候就会被跳过
        //

        System.out.println("=============================");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("宁夏枸杞");
        names2.add("黑枸杞");
        names2.add("拖鞋");
        names2.add("西洋参");
        names2.add("枸杞子");
        System.out.println(names2);

        //需求1：删除全部枸杞
        for (int i = 0; i < names2.size(); i++) {
            String name = names2.get(i);
            if (name.contains("枸杞")) {
                names2.remove(name);
                i--;//删除一个元素，i--，重新开始遍历
            }
        }
        System.out.println(names2);

        System.out.println("=============================");

        ArrayList<String> names3 = new ArrayList<>();
        names3.add("宁夏枸杞");
        names3.add("黑枸杞");
        names3.add("拖鞋");
        names3.add("西洋参");
        names3.add("枸杞子");
        System.out.println(names3);

        //需求1：删除全部枸杞
        //解决方案2：倒着遍历并删除（前提是支持索引）
        for (int i = names3.size() - 1; i >= 0; i--) {
            String name = names3.get(i);
            if (name.contains("枸杞")) {
                names3.remove(name);
            }
        }
        System.out.println(names3);


        System.out.println("=============================");

        ArrayList<String> names4 = new ArrayList<>();
        names4.add("宁夏枸杞");
        names4.add("黑枸杞");
        names4.add("拖鞋");
        names4.add("西洋参");
        names4.add("枸杞子");
        System.out.println(names4);

        //需求1：删除全部枸杞
        //方案一：迭代器遍历并删除默认也存在并发修改异常
        //可以解决：使用迭代器自己的方法来删除
        //tips：增强for和lambda(都没有办法解决并发修改异常）
        Iterator<String> it = names4.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.contains("枸杞")) {
                it.remove();//并且也做了i--
            }
        }
        System.out.println(names4);


    }
}

