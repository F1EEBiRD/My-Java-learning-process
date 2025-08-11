package DEMO;
// 智能家居控制类 单例类
public class SmartHomeControl {
    //私有化构造方法
    private  static final SmartHomeControl SHC = new SmartHomeControl();
    private SmartHomeControl(){}
    public static SmartHomeControl getInstance(){
        return SHC;
    }
    //多态
    public void control(JD jd){
        System.out.println("当前操作的是：" + jd.getName() + " " + "当前状态为" + (jd.isStatus() ? "开" : "关"));
        System.out.println("开始您的操作。。。。。。。");
        jd.press();//按下开关
        System.out.println("当前操作的是：" + jd.getName() +  " " + "当前状态变更为" + (jd.isStatus() ? "开" : "关"));
    }

    public void printAllStatus(JD[] jds) {
        //使用for循环遍历，根据索引遍历每个设备
        for (int i = 0; i < jds.length; i++) {
            System.out.println("当前操作的是：" + jds[i].getName() + "当前状态为" + (jds[i].isStatus() ? "开" : "关"));
        }
    }
}
