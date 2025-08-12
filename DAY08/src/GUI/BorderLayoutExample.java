package GUI;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        frame.add(new JButton("North"), BorderLayout.NORTH);//设置北面按钮
        frame.add(new JButton("South"), BorderLayout.SOUTH);//设置南面按钮
        frame.add(new JButton("East"), BorderLayout.EAST);//设置东面按钮
        frame.add(new JButton("West"), BorderLayout.WEST);//设置西面按钮
        frame.add(new JButton("Center"), BorderLayout.CENTER);//设置中间按钮

        frame.setVisible(true);
    }
}