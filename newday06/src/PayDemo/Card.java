package PayDemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok技术！！可以实现为类自动添加getter setter方法，无参构造器，toString方法，equals方法，hashCode方法。
@Data
@AllArgsConstructor//有参构造器
@NoArgsConstructor//无参构造器

public class Card {
    private String cardId;//车牌号
    private String name;
    private String phone;
    private double money;//余额

    //预存金额
    public void saveMoney(double money){
        this.money += money;
    }
    //消费金额
    public void payMoney(double money){
        this.money -= money;
    }


}
