package Phone;

import java.sql.SQLOutput;

public class Phone {
    //先创建一个手机类Phone，用于封装手机的数据
    //定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
    private String brand;
    private double price;
    private String color;

    public Phone() {
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //正在使用价格为xxx元xxxx的xx手机打电话.
    public void call(){
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "手机打电话");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "手机发短信");
    }


}
