package com.itheima.schoolwork.day7;

import java.util.HashMap;
import java.util.Scanner;


public class Question8 {
    public static void main(String[] args) {
        HashMap<String, Integer> goods = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品，没输入一次回车，直到end结束");
        while (true){
            String name = sc.next();
            if (name.equals("end"))break;

                   if (goods.containsKey(name)){
                       goods.put(name,goods.get(name) +1);
                   }else {
                       goods.put(name,1);
                   }


        }

        goods.forEach((k,v)-> System.out.println(k+v));
    }
}
