package APIDEMO;

public class Test2 {
    public static void main(String[] args) {
        //目标：高效拼接字符串
        // + 号拼接字符串内容，如果是大量拼接，效率极差！
        //String的对象时不可变变量：共享数据性能可以，但赋值性能极差！
/*        String s = "";
        for (int i = 0; i < 10000; i++) {
            s = s + "abc";
        }
        System.out.println(s);*/

        StringBuffer sb = new StringBuffer();//stringbuffer对象可变变量：不共享数据，但赋值性能高！
        for (int i = 0; i < 10000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
        //StringBulider只是拼接字符串的手段，结果还是要恢复成字符串（目的）
        String s = sb.toString();
        System.out.println(s);

        System.out.println("====================");

        StringBuilder sb2 = new StringBuilder();
        String result = sb2.append("张三").append("李四").append("王五").toString();
        System.out.println(result);

    }
}
