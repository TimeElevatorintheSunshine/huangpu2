package com.itheima1.practice.day7.exception1;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        // 异常的作用
        try {
            divide(1,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int divide(int a,int b){
        if (b == 0 ){
            throw new RuntimeException("b can not be zero");
        }
        int  c = a/b;
        return  c;
    }

}
