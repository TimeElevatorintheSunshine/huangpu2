package com.itheima1.practice.day5.stringBuilder1;

public class Test2 {
    public static void main(String[] args) {
        // 目标：掌握StringBuilder的好处。
        // 需求：要拼接100万次abc
        // 先用String测试看看性能
        long l = System.currentTimeMillis();

        String rs = "";
       for (int i = 1; i <= 100000 ; i++) {
            rs +=  "i";
        }

      // System.out.println(rs);
        long l1 = System.currentTimeMillis()-l;
        // long l3 = System.currentTimeMillis();
       System.out.println(l1);
        // 使用StringBuilder演示
      /*  StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            sb.append("abc");
        }
       // System.out.println(sb);
       long l2 = System.currentTimeMillis()-l3;
        System.out.println(l2);*/
    }
}
