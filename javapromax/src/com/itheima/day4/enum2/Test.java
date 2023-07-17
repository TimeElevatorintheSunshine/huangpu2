package com.itheima.day4.enum2;

public class Test {
    public static void main(String[] args) {
        // 枚举的应用场景
        switchData(Constant.BOY);
    }
    public static void switchData(Constant sex){
        switch (sex){
            case BOY:
                System.out.println("展示机甲");
                break;
            case GIRL:
                System.out.println("展示帅哥");
                break;
        }
    }
}
enum Constant{
    BOY,GIRL;
}