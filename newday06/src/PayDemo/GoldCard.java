package PayDemo;

    public class GoldCard extends Card {
        public GoldCard(String cardID, String name, String phone, double money) {
            super(cardID, name, phone, money);
        }

        @Override
        public void payMoney(double money) {
            System.out.println(" 您当前金卡消费 "+ money);
            System.out.println(" 优惠后价格为 " + money * 0.8);
            if(getMoney() < money * 0.8){
                System.out.println(" 当前余额 " +getMoney() + "当前余额不足，请充值。");
                return;//干掉方法
            }
            //更新金卡的余额
            setMoney(getMoney() - money * 0.8);
            //判断消费如果大于200，调用一个独有功能，打印洗车卷
            if(money * 0.8 >= 200){
                printWashCar();
            }else {
                System.out.println(" 当前消费不足200，没有获得洗车卷");
            }

        }
        public void printWashCar(){
            System.out.println(" 恭喜您，获得一张洗车卷");
        }


        public void depositMoney( double money) {
            System.out.println(" 金卡充值成功");

        }
    }

