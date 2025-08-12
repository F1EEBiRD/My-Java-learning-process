import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        // 设置 FlatLaf 外观（更现代）
        try {
            UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
            // 暗色模式可选：new com.formdev.flatlaf.FlatDarkLaf();
        } catch (Exception e) {
            e.printStackTrace();
        }

        initializeUI();
    }

    private void initializeUI() {
        // 窗口设置
        setTitle("用户登录");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null); // 居中显示
        setResizable(false);

        // 主面板（使用 BorderLayout）
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        mainPanel.setBackground(Color.WHITE);

        // 标题面板
        JLabel titleLabel = new JLabel("欢迎登录", SwingConstants.CENTER);
        titleLabel.setFont(new Font("微软雅黑", Font.BOLD, 24));
        titleLabel.setForeground(new Color(51, 51, 51));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 40, 0));

        // 表单面板
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // 用户名
        JLabel userLabel = new JLabel("用户名");
        userLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        userLabel.setForeground(new Color(70, 70, 70));
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(userLabel, gbc);

        usernameField = new JTextField(15);
        styleTextField(usernameField);
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(usernameField, gbc);

        // 密码
        JLabel passLabel = new JLabel("密码");
        passLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        passLabel.setForeground(new Color(70, 70, 70));
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(passLabel, gbc);

        passwordField = new JPasswordField(15);
        styleTextField(passwordField);
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(passwordField, gbc);

        // 登录按钮
        JButton loginButton = new JButton("登 录");
        styleButton(loginButton);
        gbc.gridy = 4;
        gbc.insets = new Insets(20, 0, 0, 0);
        formPanel.add(loginButton, gbc);

        // 忘记密码（可点击）
        JLabel forgetLabel = new JLabel("忘记密码？", SwingConstants.CENTER);
        forgetLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        forgetLabel.setForeground(new Color(0, 100, 200));
        forgetLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        gbc.gridy = 5;
        gbc.insets = new Insets(15, 0, 0, 0);
        formPanel.add(forgetLabel, gbc);

        // 事件监听
        loginButton.addActionListener(new LoginAction());
        forgetLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                JOptionPane.showMessageDialog(LoginFrame.this, "请联系管理员重置密码。");
            }
        });

        // 添加到主面板
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(formPanel, BorderLayout.CENTER);

        // 设置背景渐变（可选）
        setContentPane(new GradientPanel());
        add(mainPanel);

        // 设置图标（可选，需准备图标文件）
        // setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
    }

    // 美化文本框
    private void styleTextField(JComponent comp) {
        comp.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        comp.setBorder(BorderFactory.createCompoundBorder(
                comp.getBorder(),
                BorderFactory.createEmptyBorder(8, 8, 8, 8)
        ));
    }

    // 美化按钮
    private void styleButton(JButton button) {
        button.setFont(new Font("微软雅黑", Font.BOLD, 16));
        button.setBackground(new Color(0, 120, 215));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(button.getBackground());
                g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 10, 10);
                super.paint(g, c);
                g2.dispose();
            }
        });
        button.setPreferredSize(new Dimension(200, 45));
    }

    // 渐变背景面板
    class GradientPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            GradientPaint gradient = new GradientPaint(
                    0, 0, new Color(240, 248, 255),
                    0, getHeight(), new Color(173, 216, 230)
            );
            g2.setPaint(gradient);
            g2.fillRect(0, 0, getWidth(), getHeight());
        }
    }

    // 登录事件
    private class LoginAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText().trim();
            String password = new String(passwordField.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(LoginFrame.this,
                        "请输入用户名和密码！", "提示", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // 这里可以添加登录逻辑（如连接数据库、验证等）
            if ("admin".equals(username) && "123456".equals(password)) {
                JOptionPane.showMessageDialog(LoginFrame.this, "登录成功！");
                // 打开主界面...
                dispose();
            } else {
                JOptionPane.showMessageDialog(LoginFrame.this,
                        "用户名或密码错误！", "错误", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // 启动方法
    public static void main(String[] args) {
        // 使用事件调度线程
        SwingUtilities.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }
}