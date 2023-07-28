package com.itheima.schoolwork.day9;

public class Question2 {
    private static int allBeer;
    private static int allLid;
    private static int allEmptyBottle;

    public static void main(String[] args) {
        f(10);
        System.out.println(allBeer);
        System.out.println(allLid);
        System.out.println(allEmptyBottle);
    }

    public static void f(int i) {
        allBeer += i / 2;
        int buy = i / 2;
        allLid += buy;
        int money = allLid / 4 * 2;
        allLid = allLid % 4;
        allEmptyBottle += buy;
        money += allEmptyBottle / 2 * 2;
        allEmptyBottle = allEmptyBottle % 2;
        if (money < 2) {
            return;
        } else {
            f(money);
        }
    }
    public static void buy(int n){
        // 拿钱买酒
        int buyNumber = n /2;
        allBeer += buyNumber;

    }

}
