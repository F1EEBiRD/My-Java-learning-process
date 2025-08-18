package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        //目标：Collections工具类
        List<String> list = new ArrayList<>();

        //1.collections的方法批量加
        Collections.addAll(list,"张三丰","张无忌","张翠山","张学友","张良","张三");
        System.out.println(list);

        //2.打乱顺序
        Collections.shuffle(list);
        System.out.println(list);


    }
}
