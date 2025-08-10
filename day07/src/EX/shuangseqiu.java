package EX;

import java.util.Random;
import java.util.Scanner;

public class shuangseqiu {
    public static void main(String[] args) {
        //1.生成中奖号码
        int[] numbers = CreatNumbers();

        System.out.println("========================");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("========================");
        //2.输入用户购买的彩票号码
        int[] userInputnumbers = USERNumbers();
        //3.判断中奖号码和用户购买的彩票号码是否一致
        //红球 篮球
        int redCount = 0;
        int blueCount = 0;

        //判断红球
        for (int i = 0; i < userInputnumbers.length - 1; i++) {
            int redNumber = userInputnumbers[i];
            for (int j = 0; j < numbers.length - 1; j++) {
                if(redNumber == numbers[j]){
                    redCount++;
                    //如果找到了，后面的数字就没必要继续比较了
                    //跳出内循环，继续判断下一个红球是否中奖
                    break;
                }
            }
        }
        int blueNumber = userInputnumbers[userInputnumbers.length-1];
        if(blueNumber == numbers[numbers.length - 1]){
            blueCount++;
        }
        System.out.println(redCount);
        System.out.println(blueCount);

        //根据红球个数、蓝球个数，判断中奖等级
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜，中奖1000万！");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜，中奖500万！");
        }else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜，中奖3000元！");
        }else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜，中奖200元！");
        }else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)){
            System.out.println("恭喜，中奖10元！");
        }else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1)|| (redCount == 0 && blueCount == 1)){
            System.out.println("恭喜，中奖5元！");
        }


    }
    //记录用户购买的彩票号码
    public static int[] USERNumbers() {
        //创建数组用于添加用户购买的彩票号码
        //6个红球 1个蓝球 数组长度7
        int[] numbers = new int[7];
        //用户录入6个号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1;) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            if(redNumber >= 1 && redNumber <= 33){
                boolean flag = contains(numbers,redNumber);
                if(!flag){
                    //不存在
                    //有效的 可以添加到数组中
                    numbers[i] = redNumber;
                    i++ ;
                }else{
                    System.out.println("号码重复，请重新输入");
                }
            }else{
                System.out.println("输入的号码有误，请重新输入");
            }

        }
        //让用户输出篮球号码
        System.out.println("请输入蓝球号码：");
        //1~16
        while (true) {
            int blueNumber = sc.nextInt();
            if(blueNumber >= 1 && blueNumber <= 16){
                numbers[numbers.length -1] = blueNumber;
                break;
            }else{
                System.out.println("当前蓝球号码超出范围");
            }
        }
        return numbers;

    }
    //创建中奖号码

    public static int[] CreatNumbers() {
        //1,创造数组用于添加中奖号码
        //6个红球 1个蓝球， 数组长度7
        int[] numbers = new int[7];
        //2.随机生成号码并添加到数组当中
        //红球：不能重复 1 2 3 4 5 6
        //篮球：可以跟红球号码重复 5

        //生成红球号码并添加到数组中
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            //获取红球号码
           int redNumber = r.nextInt(33) + 1;
           boolean flag = contains(numbers,redNumber);
           if(! flag){
               //把红球号码添加到数组中
               numbers[i] = redNumber;
               i++;
           }
        }
        //生成篮球号码并添加到数组中
        int blueNumber = r.nextInt(16) + 1;
        numbers[numbers.length - 1] = blueNumber;
        return numbers;
    }

    //用于判断数组在数组中是否存在
    public static boolean contains(int[] arr,int number){
        for(int i = 0;i < 6;i++){
            if(arr[i] == number){
                return true;// 只要找到了，立刻返回true
            }
        }
        return false;//否则就返回 false
    }


}
