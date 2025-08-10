package fortest;

public class test4 {
    public static void main(String[] args) {
        //分析
        //1.获取1-100之间的每个数
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if(i % 2 == 0){
                sum = sum + i;
            }
            System.out.println(sum);

        }
    }
}
