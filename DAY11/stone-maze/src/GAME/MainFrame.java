package GAME;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


//自定义窗口类，创建对象，展示一个主窗口
    public class MainFrame extends JFrame {
        //设置图片位置
        private static final String imagePath = "stone-maze/src/image/";
    //准备一个数组，用户存储数字色块的行列位置：4行4列
    private int[][] imageData = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    //定义一个二维数组，用来存储最终游戏成功的数据顺序。
    private int[][] winData = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };




    //定义两个整数变量记录当前空白色块的位置。
    private int row;//行
    private int col;//列
    private int count; //统计总共移动的步数






        public MainFrame() {
            //1.调用一个初始化方法：初始化窗口
            initFrame();
            //4.打乱数组色块的顺序，再展示图片
            initRandomArray();
            //2.初始化界面：展示数字色块
            initImage();
            //3.初始化系统菜单，点击弹出菜单信息
            initMenu();
            //5.给当前窗口绑定上下左右按键事件
            initKeyPressEvent();


            //设置窗口可见
            this.setVisible(true);
        }



    private void initKeyPressEvent() {
            //给当前窗口绑定上下左右按键事件
        this.addKeyListener(new KeyAdapter() {//KeyAdapter关键词案件监听器
            @Override
            public void keyPressed(KeyEvent e) {
                //获取当前按钮的编号
                int keyCode = e.getKeyCode();
                //判断这个编号是否是上下左右的按钮
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        //用户按了上键，让图片向上移动
                        switchAndMove(Direction.UP);
                        break;
                        //用户按了下键，让图片向下移动
                    case KeyEvent.VK_DOWN:
                        switchAndMove(Direction.DOWN);
                        break;
                        //用户按了左键，让图片向左移动
                    case KeyEvent.VK_LEFT:
                        switchAndMove(Direction.LEFT);
                        break;
                        //用户按了右键，让图片向右移动
                    case KeyEvent.VK_RIGHT:
                        switchAndMove(Direction.RIGHT);
                        break;
                }
            }
        });


    }
    //控制数据交换，和图片移动
    private  void switchAndMove(Direction  direction) {
            //判断图片的方向，根据方向移动图片
        switch (direction) {
            case UP:
                //上交换的条件是行必须 <3 ,然后才开始交换。
                if (row < imageData.length - 1) {
                    //当前空白色块位置：row col
                    //需要被交换的位置：row + 1,col
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row + 1][col];
                    imageData[row + 1][col] = temp;
                    //更新当前空白色块的位置。
                    row++;
                    count++;
                }
                break;
                //用户按了下键，让图片向下移动
            case DOWN:
                if (row > 0) {
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row - 1][col];
                    imageData[row - 1][col] = temp;
                    row--;
                    count++;
                }
                break;
                //用户按了左键，让图片向左移动
            case LEFT:
                if (col < imageData.length - 1) {
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col + 1];
                    imageData[row][col + 1] = temp;
                    col++;
                    count++;
                }

                break;
                //用户按了右键，让图片向右移动
            case RIGHT:
                if (col > 0) {
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col - 1];
                    imageData[row][col - 1] = temp;
                    col--;
                    count++;
                }
                break;
        }
        //重新刷新界面！！
        initImage();
    }

    private void initRandomArray() {
            //打乱二维数组中的元素顺序
        for (int i = 0; i < imageData.length; i++) {//行
            for (int j = 0; j < imageData[i].length; j++) {//列
                //随机两个行列位置，让这两个位置交换
                int i1 = (int) (Math.random() * imageData.length);
                int j1 = (int) (Math.random() * imageData.length);

                int i2 = (int) (Math.random() * imageData.length);
                int j2 = (int) (Math.random() * imageData.length);

                int temp = imageData[i1][j1];
                imageData[i1][j1] = imageData[i2][j2];
                imageData[i2][j2] = temp;


            }
        }

        //定位空白色块的位置
        //去二维数组中遍历每个数组，只要发现这个数据等于0，这个位置就是当前色块的位置。
        OUT:
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j] == 0) {
                    //定位到空白位置
                    row = i;
                    col = j;
                    break OUT;
                }
            }
        }
    }

    private void initMenu() {
            JMenuBar menuBar = new JMenuBar();//创建菜单条
            JMenu menu = new JMenu("系统");//创建菜单
            JMenuItem exitJi = new JMenuItem("退出");//创建菜单项
        menu.add(exitJi);//添加菜单项
        exitJi.addActionListener(e -> {
            dispose();//销毁窗口
        });
        //添加一个菜单，重启
        JMenuItem restartJi = new JMenuItem("重启");
        menu.add(restartJi);
        restartJi.addActionListener(e -> {
            //重启游戏：重新打乱二维数组的顺序，重新刷新界面
            initRandomArray();
            initImage();

        });
        menuBar.add(menu);
        this.setJMenuBar(menuBar);


    }
    private void initImage() {
            //清空窗口上的全部图层
            this.getContentPane().removeAll();
            //刷新界面时，可以给界面显示步数
        //给窗口添加一个展示文字的组件
        JLabel countTxt = new JLabel("当前移动：" + count);
        countTxt.setBounds(10, 0, 100, 20);
        this.add(countTxt);




        //判断是否赢了
        if(isWin()){
            //展示胜利照片
            JLabel label = new JLabel(new ImageIcon("stone-maze/src/image/win.png"));
            label.setBounds(124,230,266,88);
            this.add( label);

        }

            //1.展示一个行列举证的图片色块一次铺满窗口（4*4）
            for (int i = 0; i < imageData.length; i++) {
                for (int j = 0; j < imageData[i].length; j++) {
                    //1 拿到图片的名称
                    String imageName = imageData[i][j] + ".png";
                    //2 创建一个JLabel对象, 设置 图片展示
                    JLabel label = new JLabel();
                    //3 设置图片到label对象中去
                    label.setIcon(new ImageIcon(( imagePath + imageName)));
                    //4 设置图片的位置展示出来
                    label.setBounds(20 + j * 100, 70+  i * 100, 100, 100);//j是列数，i是行数
                    //5 将label添加到面板中
                    this.add(label);
                }
            }


            //设置窗口的背景图片
            JLabel background = new JLabel(new ImageIcon(imagePath + "background.png"));
            background.setBounds(0, 10, 450, 484);
            this.add(background);

            //刷新新图层
            this.repaint();
        }

    private boolean isWin() {
        //判断当前游戏二维数组和赢了之后的二维数组是否一致，一致就是胜利
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j] != winData[i][j]) {

                }
            }
        }
        return false;
    }

    private void initFrame() {
        //设置窗口标题
        this.setTitle("stone-maze V 1.0 F1EEB1RD");
        //设置窗口大小
        this.setSize(465, 575);
        //设置窗口的关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口居中显示
        this.setLocationRelativeTo(null);
        //设置布局方式为绝对位置定位
        this.setLayout(null);


    }
}



