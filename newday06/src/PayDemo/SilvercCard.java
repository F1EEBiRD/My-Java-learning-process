package PayDemo;

public class SilvercCard extends  Card{

    public SilvercCard(String cardId, String name, String phone, double money) {
        super(cardId, name, phone, money);
    }

    @Override
    public void payMoney(double money) {
        System.out.println(" 您当前银卡消费 "+ money);
        System.out.println(" 优惠后的价格为 " + money *  0.9);
        if(getMoney() < money * 0.9){
            System.out.println(" 当前余额 " +getMoney() + "当前余额不足，请充值。");
            return;//干掉方法
        }
        //更新银卡余额
        setMoney(getMoney() - money * 0.9);
    }

}

