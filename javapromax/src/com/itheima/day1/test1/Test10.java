package com.itheima.day1.test1;



import java.util.Random;
import java.util.Scanner;

/**
 * 给你一个整数表示红包的总额，和另一个整数表示红包的个数
 * 表示我们要把总金额，随机分成N个红包。
 * 要求1：每个红包的金额都是随机的
 * 要求2：每个人至少1分钱
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请输入红包总额");
        int money = sc.nextInt() *100;
        System.out.println("请输入红包个数");
        int number = sc.nextInt();

        for (int i = 1; i <= number ; i++) {
            if (i == number){
                System.out.println("第" + i + "个人红包是" + (money/100.0));
            }
            int bound = money - (number - i);
            int money1 = r.nextInt(bound) +1 ;
            System.out.println("第" + i + "个人红包是" + (money1/100.0));
            money -=money1;



        }
    }
}
