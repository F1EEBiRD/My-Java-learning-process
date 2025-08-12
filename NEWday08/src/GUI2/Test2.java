package GUI2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        //第一种写法：提供实现类：创建实现类对象代表事件监听器
        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel();//创建面板
        jf.add(panel);// 添加面板


        jf.setSize(400,300);//设置窗口大小
        jf.setLocationRelativeTo(null) ;//设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭模式

        JButton jb = new JButton("登录");//创建按钮
        panel.add(jb);//添加按钮到面板中

        jb.addActionListener(new myactionlistener(jf));

        jf.setVisible(true);

    }
}


class myactionlistener implements ActionListener {
    private JFrame jf;
    public myactionlistener(JFrame jf) {
        this.jf = jf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jf,"点击了登录按钮");
    }

}

