package Stringdemo;

import java.util.Random;

public class StringDemo2 {
        // 可用字符集合：数字 + 大写字母 + 小写字母
        private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        private static final Random RANDOM = new Random();

        /**
         * 生成指定长度的验证码
         * @param length 验证码长度
         * @return 生成的验证码字符串
         */
        public static String generateCode(int length) {
            StringBuilder code = new StringBuilder();

            // 随机选择指定长度的字符
            for (int i = 0; i < length; i++) {
                int index = RANDOM.nextInt(CHARACTERS.length());
                code.append(CHARACTERS.charAt(index));
            }

            return code.toString();
        }

        // 测试方法
        public static void main(String[] args) {
            // 生成不同长度的验证码示例
            System.out.println("4位验证码: " + generateCode(4));
            System.out.println("6位验证码: " + generateCode(6));
            System.out.println("8位验证码: " + generateCode(8));
        }
    }


