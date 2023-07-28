package com.itheima.day10.io1;

public class FinallyDemo1 {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 2);
           // return;
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("==============finally==========");
        }
        System.out.println(add(1, 2));
        System.out.println(add(2, 2));

    }
    public static int add(int a , int b){
        try {
            int c = a+b;
            return c;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("==============finally1==========");
            return 111; // 会覆盖前面的return
        }
    }
}
