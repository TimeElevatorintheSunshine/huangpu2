package com.itheima.day1.test10;





import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        String s = "我是天才";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        byte[] bytes1 = s.getBytes();
        System.out.println(Arrays.toString(bytes1));
        byte[] bytes2 = s.getBytes();
        System.out.println(Arrays.toString(bytes2));
        String string = new String(bytes);
        System.out.println(string);

        String s1 = new String(bytes1, StandardCharsets.UTF_8);
        System.out.println(s1);
    }
}
