package GUI2;

import javax.swing.*;

//自定义的登录界面，认JFrame做爸爸
public class LoginFrame extends JFrame {
    public LoginFrame() {
        //1.设置窗体的标题
        this.setTitle("登录界面");
        //2.设置窗体的宽高
        this.setSize(400, 300);
        //3.设置窗体的位置
        this.setLocation(200, 200);
        //4.设置窗体的关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        init();//初始化这个窗口上的组件
    }

    private void init() {
        //创建一个登录按钮
        JButton btn = new JButton("登录");

        JPanel panel = new JPanel();
        this.add(panel);

        panel.add(btn);

    }
}

