package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo5 {
    public static void main(String[] args) {
        // 目标：掌握collection的遍历方式二：lambda
        Collection<String> names = new ArrayList<>();
        names.add("刘备");
        names.add("张飞");
        names.add("关羽");
        names.add("赵云");

/*        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
//        ↑再简化
        names.forEach(s -> System.out.println(s));//可以alt+enter直接简化
//        ↑再简化
        names.forEach(System.out::println);













    }
}
