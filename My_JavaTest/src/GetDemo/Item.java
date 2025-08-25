package GetDemo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Item {
    private String name;
    private int price;
    private double weight;

    // 计算单价的方法
    public double getUnitPrice() {
        return price / weight;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return name + " (重: " + weight + " 升, 总价值: " + price + ", 单价: " + getUnitPrice() + ")";
    }



}


