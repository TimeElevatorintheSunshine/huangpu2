package com.itheima.schoolwork.day6;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        // 键盘录入取钱金额
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入取钱金额: ");
            double drawMoney = sc.nextDouble();

            // 通过多态的方式创建AtmService对象
            AtmService atmService = new AtmServiceImpl();

            // 调用drawMoney方法进行取钱
            double money = 0;
            try {
                money = atmService.drawMoney(drawMoney);
                // 输出剩余金额
                System.out.println("恭喜你，取钱成功! 本次取钱金额为：" + drawMoney + ", 剩余金额：" + money);
                break;
            } catch (Exception e) {

            }


        }
    }

}

interface AtmService {   // atm机业务处理类接口

    // 取钱的方法
    public abstract double drawMoney(double money);

}

class AtmServiceImpl implements AtmService {          // atm机业务处理类

    // 定义总金额
    private double totalMoney = 20000;

    // 取钱的方法
    @Override
    public double drawMoney(double money) {
        if (money < 0) {
            System.out.println("输入的金额不合法！");
            throw new MoneyException();
        }
        if (money > 20000) {
            System.out.println("余额不足");
            throw new MoneyException();
        }
        return totalMoney - money;
    }

}

class MoneyException extends RuntimeException {
    public MoneyException() {
    }

    public MoneyException(String message) {
        super(message);
    }
}