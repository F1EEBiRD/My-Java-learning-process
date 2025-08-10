package fortest;

public class test3 {
    public static void main(String[] args) {
        /* 需求 求1-5之间的和*/

        //开始条件1
        //结束条件5
        //赋值一个变量，用来进行累加
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            //1.求和的变量不能定义在循环的里面，因为变量只能所属大括号中使用
            //2 如果我们把变量定义在循环里面，那么当前变量只能被循环使用一次
            //当本循环结束之后，变量会销毁，那么sum变量就会消失
            //当循环再次开始，sum变量就会重新被创建，那么sum变量的值就会变为0
            //结论：sum变量必须定义在循环外边，这样sum变量的值就会一直保存下来
            //int sum = 0;
            //System.out.println(i);
            //可以把得到的变量累加到sum里
            sum += i;//sum = sum + i;
            System.out.println(sum);
        }
        System.out.println(sum);

    }
}
