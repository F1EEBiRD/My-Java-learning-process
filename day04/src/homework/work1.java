package homework;

public class work1 {
    public static void main(String[] args) {
        /*李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，
        而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，
        新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？请在控制台输出。*/
        /*1. 计算不使用以旧换新时的花费。
2. 计算使用以旧换新时的花费。
3. 使用if..else语句判断哪种方式更省钱，并输出结果*/
        //1.定义旧手机价格
        double oldPhone = 1500;
        //定义把手机卖了的买到手机的价格
        double newPhone1 = 7988 - 1500;
        System.out.println("手机不用优惠的价格是：" + newPhone1);
        //定义以旧换新的价格
        double newPhone2 = (7988 - 1500) * 0.8;
        System.out.println("手机使用优惠的价格是：" + newPhone2);
        //比较第一种和第二种
        if (newPhone1 < newPhone2) {
            System.out.println("不用以旧换新");
        }else{
                System.out.println("以旧换新");
        }
    }
}
