package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {
        // 目标：掌握collection的遍历方式之一：迭代器遍历
        ArrayList<String> names = new ArrayList<>();
        names.add("刘备");
        names.add("张飞");
        names.add("关羽");
        names.add("赵云");
        System.out.println(names);//[刘备, 张飞, 关羽, 赵云]
                                  //it                    迭代器初始位置

        //1.得到这个集合的迭代器对象
        Iterator<String> it = names.iterator();
       /* System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/
        //System.out.println(it.next());//迭代器遍历完毕，会报NoSuchElementException异常

        //2.使用一个while循环来遍历
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);//记得不要多写，迭代器遍历完毕，会报NoSuchElementException异常
        }




    }
}
