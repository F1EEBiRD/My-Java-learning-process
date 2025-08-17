package GenericityDemo5;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;

public class GenericityDemo6 {
    public static void main(String[] args) {
        //目标：搞清楚泛型和集合不支持基本数据类型，只能支持对象类型（引用数据类型）
        //ArrayList<int> list = new ArrayList<>();
        //泛式擦除：泛式工作在编译阶段，等编译后凡是就没用了，所以泛型在编译后都会被擦除.所有数据类型都会被擦除为Object
        //list.add(12);
        //Integer i = new Integer(100);//过时


        Integer it1 = Integer.valueOf(100);//推荐
        Integer it2 = Integer.valueOf(100);
        System.out.println(it1 == it2);

        //自动装箱成对象：基本数据类型的数据可以直接变成包装对象的数据，不需要额外做任何事情
        Integer it11 = 130;//新对象
        Integer it12 = 130;//新对象
        System.out.println(it11 == it12);

        //自动拆箱
        int i = it11;
        System.out.println(i);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);//自动装箱，把123当成了对象
        list.add(120);

        int rs = list.get(1);//自动拆箱
        System.out.println(rs);

        System.out.println("====================");

        // 包装类新增的功能
        //1.把基本类型的数据转换成字符串
        int j = 23;
        String rs1 = Integer.toString(j);//"23"
        System.out.println(rs1 + 1);// 231

        Integer i2 = j;
        String rs2 = i2.toString();//"23"
        System.out.println(rs2 + 1);// 231

        String rs3 = j + "";
        System.out.println(rs3 + 1); //231

        System.out.println("====================");

        //2.吧字符串数据转换成对应的基本数据类型（很有用）。
        String str = "98";
        //int i1 = Integer.parseInt(str);
        int i1 = Integer.valueOf(str);
        System.out.println(i1 + 2);

        String str2 = "1.23";
        //double d = Double.parseDouble(str2);
        double d = Double.valueOf(str2);
        System.out.println(d + 2);




    }
}
