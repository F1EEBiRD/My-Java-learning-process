package genericityDemo.GenericityDemo4;

import java.util.ArrayList;

public class GenericityDemo5 {
    public static void main(String[] args) {
        //目标：理解通配符的上下限。
        ArrayList<Xiaomi> xiaomis = new ArrayList<>();
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        go(xiaomis);

        ArrayList<LX> lxs = new ArrayList<>();
        lxs.add(new LX());
        lxs.add(new LX());
        lxs.add(new LX());
        go(lxs);

    }

    //需求：开发一个极品飞车的游戏。
    //虽然xiaomi和lx都是car的子类，但ArrayList<Xiaomi>和ArrayList<LX>是两个不同的集合。
    //? extends Car：？能接受的必须是car或者car的子类
    //? super Car：？能接受的必须是car或者car的父类/
    public static void go(ArrayList<? extends Car> cars){

    }

}
