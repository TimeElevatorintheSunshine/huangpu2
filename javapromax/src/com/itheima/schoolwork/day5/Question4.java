package com.itheima.schoolwork.day5;

import java.util.Arrays;
import java.util.Random;

public class Question4 {
    public static void main(String[] args) {

        // 定义奖项数组,并为其设置值
        Awards[] awards = new Awards[4] ;
        awards[0] = new Awards("一等奖" , 1,0,1) ;
        awards[1] = new Awards("二等奖" , 2,1,3) ;
        awards[2] = new Awards("三等奖" , 3,3,6) ;
        awards[3] = new Awards("谢谢惠顾" , 4,6,10) ;

        // 补全代码
        Random r = new Random();
        long l = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(awards[3].getHigt());
            System.out.println(binarySearch(awards, num));
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);

    }

    // 二分查找实现
    public static Awards binarySearch(Awards[] awards , int num) {
        if (num < awards[0].getHigt())return awards[0];
        if (num >=awards[1].getLow()  && num < awards[1].getHigt())return awards[1];
        if (num >=awards[2].getLow()  && num < awards[2].getHigt())return awards[2];
        if (num >=awards[3].getLow()  && num < awards[3].getHigt()) return awards[3];
        return null;
    }
}
 class Awards {           // 奖项

    private String name ;       // 奖项名称
    private int weight ;        // 权重
    private int low ;           // 权重区间最小值
    private int higt;           // 权重区间最大值

     @Override
     public String toString() {
         return "恭喜xxx先生/女士获得:" + name;
     }

     public Awards(String name, int weight, int low, int higt) {
         this.name = name;
         this.weight = weight;
         this.low = low;
         this.higt = higt;
     }

     public Awards(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigt() {
        return higt;
    }

    public void setHigt(int higt) {
        this.higt = higt;
    }
}
