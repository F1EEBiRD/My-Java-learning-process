package ListDemo;

import java.util.LinkedList;

public class ListDemo1 {
    public static void main(String[] args) {
        //目标：用LinkedList做一个队列对象
        //基于双链表实现
        //增删快，查询满，首尾操作比较快
        //Arraylist基于数组实现,增删慢，但查询快
        LinkedList<String> names = new LinkedList<>();
        //入队
        names.addLast("刘备");
        names.addLast("张飞");
        names.addLast("关羽");
        names.addLast("赵云");
        System.out.println(names);//[刘备, 张飞, 关羽, 赵云]


        //出队
        System.out.println(names.removeFirst()); //刘备
        System.out.println(names.removeFirst()); //张飞
        System.out.println(names.removeLast());  //关羽
        System.out.println(names);


        System.out.println("==================");


        //做一个栈
        //进入的过程push/进栈，离开的过程pop/出栈
        //先进后出
        LinkedList<String> stack = new LinkedList<>();
        stack.addFirst("第一颗子弹");
        stack.addFirst("第二颗子弹");
        stack.addFirst("第三颗子弹");
        stack.addFirst("第四颗子弹");
        System.out.println(stack);//[第四颗子弹, 第三颗子弹, 第二颗子弹, 第一颗子弹]














    }
}
