package com.itheima.schoolwork.day3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入对应的付款方式标号");
        int code = scanner.nextInt();
        Pay.get(code);

    }
}
enum Pay{
    CHARGE_TYPE_CHARGED(10131001,"自费"),
    CHARGE_TYPE_FREE(10131002,"免费"),
    CHARGE_TYPE_MEMBER_RIGHTS(10131003,"会员权益");
    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void get(int number){
        Pay[] values = Pay.values();
        for (int i = 0; i < values.length; i++) {
            if (number == values[i].getNumber()){
                System.out.println(values[i].getName());
            }
        }
    }
    Pay() {


    }

    Pay(int number, String name) {
        this.name = name;
        this.number = number;
    }
}