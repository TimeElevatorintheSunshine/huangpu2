package com.itheima.day1.test1;

/**
 * 需求1：键盘录入一个正整数 x ，判断该整数是否为一个质数。
 * 需求2：给定一个范围，比如100~1000，统计这个范围内有多少个质数。
 */
public class Test7 {
    public static void main(String[] args) {

        searchData(100,1000);
    }

    private static void searchData(int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (check(i)){
                count++;
                System.out.print(i+"\t");
            }
        }
        System.out.println("");
        System.out.println(count + "个质数");
    }

    private static boolean check(int i) {
        for (int j = 2; j < i/2; j++) {
            if (i % j ==0){
                return false;
            }
        }
        return true;
    }

}
