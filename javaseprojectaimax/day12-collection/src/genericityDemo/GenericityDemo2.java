package genericityDemo;

public class GenericityDemo2 {
    public static void main(String[] args) {
        // 目标 ：学习自定义泛型类
        // 需求：模拟一个ArrayList集合自定义一个集合MYArrayList
        MYArrayList<String> mlist = new MYArrayList<>();// JDK7 新特性
        mlist.add("hello");
        mlist.add("world");
        mlist.add("java");
        mlist.add("前端");

        System.out.println(mlist.remove("java") );
        System.out.println(mlist);
    }
}
