package ReflectDemo1;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        //目标：反射的基本作用。
        //1.类的全部成分的获取
        //2.可以破坏封装性
        //3.可以绕过泛型的约束
        ArrayList<String> list = new ArrayList<>();
        list.add("张飞");
        list.add("关羽");
        list.add("刘备");

        Class c1 = list.getClass();//c1 == ArrayList.class
        //获取Arraylist的add方法
        Method add = c1.getDeclaredMethod("add", Object.class) ;
        //触发list集合对象的add方法执行
        add.invoke(list, 9.9);//翻墙
        add.invoke(list, true);//翻墙

        System.out.println(list);
    }
}
