package com.itheima1.practice.day7.exception1;

import java.util.Scanner;

public class ExceptionDemo5 {

    public static void main(String[] args) {
        // 异常处理，尝试修复
        while (true) {
            try {
                inputAge();
                break;
            } catch (Exception e) {
                System.out.println("有毛病");
            }
        }
    }
    public static void inputAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入合法年龄");
        int age = sc.nextInt();
        if (age <0 || age > 150){
            System.out.println("请您输入正确年龄");
            inputAge();
        }else {
        System.out.println(age);
        }
    }
}

