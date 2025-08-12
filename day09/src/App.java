// 文件路径: src/App.java （不加 package）
import UI.LoginUI;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        // 使用 SwingUtilities 确保线程安全
        SwingUtilities.invokeLater(() -> {
            new LoginUI();
        });
    }
}