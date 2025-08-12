package arrayList;

import java.util.ArrayList;

public class ArratListDemo1 {
    public static void main(String[] args) {
    // 目标：掌握ArrayList集合的基本使用
    // 创建ArrayList对象，代表一个集合容器
        //public class ArrayList<E>标签（比如男or女） extends AbstractList<E>
        ArrayList<String> list = new ArrayList<>();
    // 添加数据
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("赵敏");
        System.out.println(list);//[hello, world, java, 赵敏]
    // 查看数据
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            //i 0 1 2 3
            String s = list.get(i);
            System.out.println(s);
        }
    // 删除数据
        System.out.println(list.remove(0));//根据索引删除
        System.out.println(list);

        System.out.println(list.remove("java"));//根据元素删除
        System.out.println(list);



    // 修改数据
        list.set(0,"赵敏");//修改了当前索引0world变成了赵敏
        System.out.println(list);



    }
}
