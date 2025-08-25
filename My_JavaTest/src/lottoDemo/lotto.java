package lottoDemo;

import java.util.*;

public class lotto {
    public static void main(String[] args) {
        //某双色球系统，红球是1-35之间的数据，篮球是1-15之间的数据，一注双色球号码是由6个不重复的号码和1个篮球号码组成的。
        //**具体功能点的要求如下：**
        //
        //* 请随机一组双色球号码，6个红球号码要求不重复，且升序排序输出，篮球号码放在最后面输出。
        //
        //* 假设上图展示的是中奖号码，请用程序判断出第一个功能随机出的双色球号码中了几个红球和几个蓝球。
        //
        //

        //生成随机红球
        List<Integer> redBalls = getRedBalls();
        //生成随机篮球
        int blueBall = getBlueBall();

        System.out.println("中奖号码为：" + "红球" + redBalls + " " + "篮球为：" + blueBall);

        //模拟中奖号码（死测试）
        /*List<Integer> winRedBalls = Arrays.asList(10, 12, 30, 16, 7, 17);
        int winBlueBall = 12;*/

        //模拟中奖号码，但是是自己输入 用hashset
        //红球
        Set<Integer> ScannerRedBalls = new HashSet<>();
        System.out.println("请输入 6 个红球号码（范围 1-35，不能重复）：");
        while (ScannerRedBalls.size() < 6) {
            Scanner Rednumber = new Scanner(System.in);
            int redball =  Rednumber.nextInt();
            if (redball < 1 || redball > 35) {
                System.out.println("输入的号码超出范围，请重新输入：");
                continue;
            }
            if (ScannerRedBalls.contains(redball)) {
                System.out.println("输入的号码重复，请重新输入：");
                continue;
            }
            ScannerRedBalls.add(redball);
        }
        List<Integer> userRedBalls = new ArrayList<>( ScannerRedBalls);
        Collections.sort(userRedBalls);


        //篮球
        System.out.println("请输入篮球号码（范围 1-15）：");
        Scanner Bluenumber = new Scanner(System.in);
        int blueball = Bluenumber.nextInt();
        if (blueball < 1 || blueball > 15) {
            System.out.println("输入的号码超出范围，请重新输入：");
            return;
        }
        int ScannerBlueBall = blueball;

        //打印用户输入的号码
        System.out.println("用户输入的号码为：" + "红球" + ScannerRedBalls + " " + "篮球为：" + ScannerBlueBall);

        //判断中奖号码
        int redBallHit = 0;
        int blueBallHit = 0;
        for (int red : ScannerRedBalls) {
            if (redBalls.contains(red)) {
                redBallHit++;
            }
        }
        if (blueBall == ScannerBlueBall) {
            blueBallHit++;
        }
        System.out.println("中了：" + "红球" + redBallHit + "个" + "篮球" + blueBallHit + "个");

        //判断奖项
        String prize = prizeLevel(redBallHit, blueBallHit == 1);
        System.out.println("恭喜您！中了：" + prize + "！!!");

    }



    //中奖等级
    private static String prizeLevel(int redBallHit, boolean blueBallHit) {
        if (redBallHit == 6 && blueBallHit) return "一等奖";
        if (redBallHit == 6)            return "二等奖";
        if (redBallHit == 5 && blueBallHit) return "三等奖";
        if (redBallHit == 5 || (redBallHit == 4 && blueBallHit)) return "四等奖";
        if (redBallHit == 4 || (redBallHit == 3 && blueBallHit)) return "五等奖";
        if (blueBallHit) return "六等奖";
        return "未中奖";
    }


    private static List<Integer> getRedBalls() {
        //生成随机红球
        Random redBalls = new Random();
        //创建集合：用Hash Set保证不重复
        Set<Integer> redBallSet = new HashSet<>();
        //循环生成:生成6个红球，
        while(redBallSet.size() < 6){
            int redBall = redBalls.nextInt(35) + 1;
            redBallSet.add(redBall);
        }
        //转换为List
        List<Integer> redBallsList = new ArrayList<>(redBallSet);
        //排序
        Collections.sort(redBallsList);
        //返回
        return redBallsList;
    }

    private static int getBlueBall() {
        //生成随机篮球
        Random blueBall = new Random();
        return blueBall.nextInt(15) + 1;

    }
}

