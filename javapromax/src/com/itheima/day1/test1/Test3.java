package com.itheima.day1.test1;

import java.util.Random;
import java.util.Scanner;

/**
 * 需求：程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少？
 */
public class Test3 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        guess(number);

    }
    public static void guess(int number){
        Scanner sc = new Scanner(System.in);
        System.out.println("1-100猜吧");
        while (true) {
            int guessNumber = sc.nextInt();
            if (guessNumber > number){
                System.out.println("过大");
            }else if (guessNumber < number){
                System.out.println("过小");
            }else {
                System.out.println("猜对了");
                System.out.println(number);
                return;
            }
        }
    }
}
