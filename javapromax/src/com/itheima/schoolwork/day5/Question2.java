package com.itheima.schoolwork.day5;

import java.util.Random;
import java.util.function.Supplier;


/**
 * 在注册网站用户的时候，大部分的网站都会先生成一个随机的验证码展示给用户，用于区分正常人和机器的操作。如下图所示
 */
public class Question2 {
    // 验证码可选字符
    private static final String OPTIONS_CAHS = "023456789abcdefghjklmnopqrstuvwxyz" ;
    private static Random r= new Random();
    public static void main(String[] args) {

        // 在等号的右边补全代码
        String verificationCode = verificationCode(()-> {
                String s = "";
                for (int i = 0; i < 4; i++) {
                    int i1 = r.nextInt(OPTIONS_CAHS.length());
                    s += OPTIONS_CAHS.charAt(i1);
                }
                return s;
        });

        // 输出
        System.out.println("本次生成的验证码为：" + verificationCode);

    }

    // 调用该方法生成一个4位的随机验证码
    public static String verificationCode(Supplier<String> supplier) {

        return  supplier.get();
    }
}
