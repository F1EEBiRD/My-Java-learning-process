package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;

    public LoginUI() {
        super("登录界面");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null); // 居中

        createAndShowGUI();
    }

    private void createAndShowGUI() {
        // 主面板
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(240, 240, 240));

        Font customFont = new Font("楷体", Font.BOLD, 18);
        Color primaryColor = new Color(66, 135, 245);
        Color secondaryColor = new Color(204, 204, 204);

        // 标题
        JLabel titleLabel = new JLabel("黑马程序员人事管理系统");
        titleLabel.setBounds(50, 30, 300, 30);
        titleLabel.setFont(new Font("楷体", Font.BOLD, 20));
        panel.add(titleLabel);

        // 用户名
        JLabel usernameLabel = new JLabel("用户名：");
        usernameLabel.setBounds(50, 100, 80, 30);
        usernameLabel.setFont(customFont);
        panel.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(140, 100, 190, 30);
        usernameField.setFont(customFont);
        panel.add(usernameField);

        // 密码
        JLabel passwordLabel = new JLabel("密   码：");
        passwordLabel.setBounds(50, 150, 80, 30);
        passwordLabel.setFont(customFont);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(140, 150, 190, 30);
        passwordField.setFont(customFont);
        panel.add(passwordField);

        // 登录按钮
        loginButton = new JButton("登   录");
        loginButton.setBounds(50, 220, 120, 35);
        loginButton.setFont(customFont);
        loginButton.setBackground(primaryColor);
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        panel.add(loginButton);

        // 注册按钮
        registerButton = new JButton("注   册");
        registerButton.setBounds(210, 220, 120, 35);
        registerButton.setFont(customFont);
        registerButton.setBackground(secondaryColor);
        registerButton.setForeground(Color.BLACK);
        registerButton.setFocusPainted(false);
        panel.add(registerButton);

        // 添加动作监听（示例）
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText().trim();
                String password = new String(passwordField.getPassword());
                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(LoginUI.this, "请输入用户名和密码！");
                } else {
                    JOptionPane.showMessageDialog(LoginUI.this, "登录成功！欢迎: " + username);
                }
            }
        });

        registerButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(LoginUI.this, "注册功能暂未实现。");
        });

        // 添加面板
        add(panel);
        setVisible(true);
    }
}