package com.itheima.exam1.demo7;

import java.util.*;

public class UnionLotto {
    public static void main(String[] args) {
        // 创建集合生成并排序红球
        Set<Integer> redNumber = new TreeSet<>();
        Random r = new Random();
        while (redNumber.size() != 6) {
            redNumber.add(r.nextInt(35) + 1);
        }

        // 创建一个新集合放入红球并生产一个蓝球

        List<Integer> allNumber = new ArrayList<>();
        for (Integer integer : redNumber) {
            allNumber.add(integer);
        }
        allNumber.add(r.nextInt(16) + 1);
        System.out.println("您的双色球号码是:" + allNumber);

        // 创建一个新集合存入中奖号码
        List<Integer> luckyNumber = new ArrayList<>();
        Collections.addAll(luckyNumber, 10, 12, 30, 16, 7, 17, 12);
        System.out.println("中奖双色球号码是:" + luckyNumber);

        // 定义两个变量记录红球和篮球中奖个数
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < allNumber.size() - 1; i++) {
            for (int j = 0; j < luckyNumber.size() - 1; j++) {
                if (allNumber.get(i) == luckyNumber.get(j)) {
                    redCount++;
                }
            }
        }
        blueCount = allNumber.get(allNumber.size() - 1) == luckyNumber.get(luckyNumber.size() - 1) ? 1 : 0;
        System.out.println("红球中奖个数为:" + redCount);
        System.out.println("蓝球中奖个数为:" + blueCount);
    }
}
