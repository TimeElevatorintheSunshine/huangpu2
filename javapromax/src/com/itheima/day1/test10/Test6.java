package com.itheima.day1.test10;


/**
 * 啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶，
 * 请问10元钱可以喝多少瓶酒，剩余多少空瓶和盖子。
 */
public class Test6 {
    private static int allBeer;
    private static int allLid;
    private static int allEmptyBottle;

    public static void main(String[] args) {
        f(10);
        System.out.println(allBeer);
        System.out.println(allLid);
        System.out.println(allEmptyBottle);
    }

    private static void f(int i) {
        allBeer += i / 2;
        int lid = i / 2;
        allLid += lid;
        int money = allLid / 4 * 2;
        allLid = allLid % 4;
        int EmptyBottle = i / 2;
        allEmptyBottle += EmptyBottle;
        money += allEmptyBottle / 2 * 2;
        allEmptyBottle = allEmptyBottle % 2;
        if (money < 2) {
            return;
        } else {
            f(money);
        }

    }
}
