package Method1reference;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        //目标：特定类型的方法引用
        //需求：有一个字符串数据,里面有一些人的名字，请按照名字的首字母升序排序。
        String[] names = {"Tom","Jerry","Mike","angela","Rose","Andy","CaoCao","Bobi","曹操"};

        //把这个数组进行排序：Arrays.sort(names, Comparator);
        //Arrays.sort(names); //默认按照首字母升序排序
        //要求：忽略首字母的大小进行升序排序（Java官方默认是搞不定的，需要我们指定比较规则）
/*
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //o1 angela
                //o2 Andy
                return o1.compareToIgnoreCase(o2);//java已经为我们提供了字符串按照首字母忽略大小写比较的方法：compareToIgnoreCase
            }
        });
*/


        Arrays.sort(names, ( o1,  o2) -> o1.compareToIgnoreCase(o2) );

        //特定类型方法引用：类型名称：：方法命
        Arrays.sort(names, String::compareToIgnoreCase);



        //Arrays.sort(names);//默认按照首字母升序排序
        System.out.println(Arrays.toString(names));

    }
}
