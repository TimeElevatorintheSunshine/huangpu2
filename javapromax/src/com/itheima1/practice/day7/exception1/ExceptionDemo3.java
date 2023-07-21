package com.itheima1.practice.day7.exception1;

import com.itheima.day7.exception1.AgeIllegalException;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        // 自定义异常
        try {
            checkAge(151);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            checkAge1(663);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void checkAge(int age) throws Exception {

        if (age < 0 || age >150) {
            // 出现异常，抛出去异常
            // throw 再方法内部使用，用于创建并立即抛出异常
            // throws 用在方法上，用于把方法内部的异常跑出去给调用者
            throw new AgeIllegalException();
        }else {
            System.out.println("年龄合法" + age);
        }
    }

    public static void checkAge1(int age) {
        if (age < 0 || age > 150) {
            // 出现异常，抛出去异常
            // throw 再方法内部使用，用于创建并立即抛出异常
            // throws 用在方法上，用于把方法内部的异常跑出去给调用者
            throw new AgeIllegalRunTimeException("/age is illegal");
        } else {
            System.out.println("年龄合法" + age);
        }
    }
}
