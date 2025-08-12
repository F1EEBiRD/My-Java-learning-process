package GUI2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test {
    public static void main(String[] args) {
        // 目标： 快速入门一下GUI Swing的编程
        //1.创建一个窗口，有一个登录按钮
        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel();//创建面板
        jf.add(panel);// 添加面板


        jf.setSize(400,300);//设置窗口大小
        jf.setLocationRelativeTo(null) ;//设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭模式

        JButton jb = new JButton("登录");//创建按钮
        panel.add(jb);//添加按钮

        //给按钮绑定点击事件监听器
        jb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //一旦点击jb按钮，底层出发这个方法执行
                //e是事件对象，里面封装了点击事件所触发的信息
                JOptionPane.showMessageDialog(jf,"有人点击了登录");

            }
        });

        //需求：监听用户键盘上下左右四个按钮的事件。
        //给jf窗口整体绑定了一个键盘事件监听器
        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //e是事件对象，里面封装了点击事件所触发的信息
                int keyCode = e.getKeyCode();//获取键盘按键的编码
                //判断按键编码是否是上，下，左，右
                if (keyCode == KeyEvent.VK_UP) {
                    JOptionPane.showMessageDialog(jf, "有人点击了键盘的up");
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    JOptionPane.showMessageDialog(jf, "有人点击了键盘的down");
                } else if (keyCode == KeyEvent.VK_LEFT){
                    JOptionPane.showMessageDialog(jf, "有人点击了键盘的left");
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    JOptionPane.showMessageDialog(jf, "有人点击了键盘的right");
                }
            }
        });



        jf.setVisible(true);//显示窗口

        //让窗口成为焦点。
        jf.requestFocus();//让窗口成为焦点



    }
}
