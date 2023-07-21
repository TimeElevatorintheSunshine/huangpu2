package com.itheima.day7.exception1;

import java.util.Scanner;

public class ExceptionDemo5 {

    public static void main(String[] args) {
        // 异常处理，尝试修复
        while (true) {
            try {
                inputAge();
            } catch (Exception e) {
                System.out.println("年龄有问题");
            }
        }
    }
    public static void inputAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入合法年龄");
        int age = sc.nextInt();
        System.out.println(age);
    }
}

