package COM.BAOMIN;
public class arithmeticoperatordemo1 {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2);//5
        //-
        System.out.println(3 - 2);//1
        //* （shift + 8）
        System.out.println(3 * 2);
        //如果在计算中有小数参与
        //结论：
        //在代码中，如果有小数参与运算，结果有可能不精确
        //具体原因javase详细讲解
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
    }
}
