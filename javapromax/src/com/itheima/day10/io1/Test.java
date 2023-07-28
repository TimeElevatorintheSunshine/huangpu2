package com.itheima.day10.io1;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Test {
    public static void main(String[] args)throws Exception {
        // 编码
        String name = "喜羊羊爱灰太狼6666";
        byte[] bytes = name.getBytes(); // 默认UTF-8
        byte[] gbk = name.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(gbk.length);
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(gbk));
        // 解码
        String s = new String(bytes);
        System.out.println(s);
        //String s1 = new String(gbk);
        String s1 = new String(gbk,"GBK");
        System.out.println(s1);

        String data = "A little of ever thing is nothing in the main";
        byte[] bytes1 = data.getBytes(StandardCharsets.US_ASCII);
        String s2 = new String(bytes1);
        System.out.println(s2);

    }
}
