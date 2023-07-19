package com.itheima1.practice.day6.regex;

import java.util.Scanner;

public class RegexDemo2 {
    public static void main(String[] args) {
        checkTime();
        checkPhone();
        checkEmail();
    }

    public static void checkPhone() {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入电话号码");
            String phone = sc.next();
            if (phone.matches("(1[3-9]\\d{9}|0[1-9]\\d{1,5}-?[1-9]\\d{5,15})")){
                System.out.println("录入成功");
                break;
            }else {
                System.out.println("有毛病");
            }
        }
    }
    public static void checkEmail() {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入邮箱号码");
            String phone = sc.next();
            if (phone.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,20}){1,2}")){
                System.out.println("录入成功");
                break;
            }else {
                System.out.println("有毛病");
            }
        }
    }

    public static void checkTime() {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入时间");
            String phone = sc.next();
            if (phone.matches("([0-1][0-9]|2[0,3]):[0-5][0-9]:[0-5][0-9]")){
                System.out.println("录入成功");
                break;
            }else {
                System.out.println("有毛病");
            }
        }
    }
}
