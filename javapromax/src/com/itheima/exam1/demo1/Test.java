package com.itheima.exam1.demo1;

import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        // 生产六个不重复的红球，升序输出，输出一个篮球
        Set<Integer> redNumbers = new TreeSet<>();
        Random random = new Random();
        while (redNumbers.size() < 6) {
            redNumbers.add(random.nextInt(35) + 1);
        }
        System.out.println("红球号码:" + redNumbers);
        int blueNumber = random.nextInt(16) + 1;
        System.out.println("篮球号码:" + blueNumber);

        // 先把中奖号码拿进来
        List<Integer> luckRedNumber = new ArrayList<>();
        Collections.addAll(luckRedNumber, 10, 12, 30, 16, 7, 17);
        int luckBlueNumber = 12;
        System.out.println("中奖红球号码:" + luckRedNumber);
        System.out.println("中奖篮球号码:" + luckBlueNumber);

        // 中了几个红球篮球
        int redCount = 0;
        int blueCount = 0;
        for (Integer redNumber : redNumbers) {
            for (Integer integer : luckRedNumber) {
                if (redNumber == integer) {
                    redCount++;
                    break;
                }
            }
        }
        blueCount= (blueNumber == luckBlueNumber) ? 1 : 0;
        System.out.println("红球终结" +redCount );
        System.out.println("红球终结" +blueCount );
    }
}
