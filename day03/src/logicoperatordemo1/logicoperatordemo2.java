package logicoperatordemo1;

public class logicoperatordemo2 {
    public static void main(String[] args) {
        //1.&&
        //运行结果跟单个&一样
        //表示两边都为真，结果才是真
        System.out.println(true && true);//true
        System.out.println(false && false);//false
        System.out.println(true && false);//false
        System.out.println(false && true);//false

        //2.||
        //运行结果跟单个|一样
        //表示两边都为假，结果才是假
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(true || false);//true
        System.out.println(false || true);//true

        //3.短路逻辑运行符具有短路效果
        //简单理解，如果左边为真，右边不执行
        int a = 10;
        int b = 20;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
