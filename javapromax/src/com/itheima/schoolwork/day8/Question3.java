package com.itheima.schoolwork.day8;

public class Question3 {
    public static void main(String[] args) {

        System.out.println(f(1));
    }

    private static int f(int x) {
        if (x == 10 ){
            return 1;
        }
        return 2*f(x+1) +2;
    }
}
