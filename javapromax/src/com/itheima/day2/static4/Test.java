package com.itheima.day2.static4;



public class Test {
    public static void main(String[] args) {
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1.aga);
        System.out.println(a2);

    }
}
