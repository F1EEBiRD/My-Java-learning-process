package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo4 {
    public static void main(String[] args) {
        // 目标：掌握collection的遍历方式二：增强for
        Collection<String> names = new ArrayList<>();
        names.add("刘备");
        names.add("张飞");
        names.add("关羽");
        names.add("赵云");
        System.out.println(names);//[刘备, 张飞, 关羽, 赵云]
                                  //it                    迭代器初始位置

        //1.得到这个集合的迭代器对象

        for (String name : names){
            System.out.print(name);
        }

        System.out.println(" ");

        String[] namesArray = {"关羽","张飞","刘备","赵云"};
        for (String name : namesArray){
            System.out.print(name);
        }





    }
}
