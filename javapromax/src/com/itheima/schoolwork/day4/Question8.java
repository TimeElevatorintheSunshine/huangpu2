package com.itheima.schoolwork.day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 如图所示:我们在逛淘宝的时候,搜索商品之后都可以按照价格从低到高显示,
 * 后面淘宝可能会出现新的商品,那么新添的商品也会按照价格从低到高重新排序,请设计一个程序,完成添加新商品之后价格重新排序.
 */
public class Question8 {
    public static void main(String[] args) {
        Double[] oldGoods = {22.2,33.4,12.3,66.3,99.2,55.3,13.3};
        System.out.println("请输入新商品价格");
        Scanner scanner = new Scanner(System.in);
        Double price = scanner.nextDouble();
        Double[] newGoods = new Double[oldGoods.length+1];
        System.arraycopy(oldGoods,0,newGoods,0,oldGoods.length);
        newGoods[newGoods.length-1] = price;

        Arrays.sort(newGoods);
        System.out.println(Arrays.toString(newGoods));

    }
}
