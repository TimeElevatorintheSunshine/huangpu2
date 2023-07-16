package com.itheima.day1.test4;

public class Test {
    public static void main(String[] args) {
        provideInfo(A.BOY);
    }
    public static void provideInfo(A sex){
        switch (sex){
            case BOY :
                System.out.println("男生");
                break;
            case GIRL:
                System.out.println("女生");
                break;

        }
    }
}
