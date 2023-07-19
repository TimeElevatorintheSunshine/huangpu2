package com.itheima.day1.test10;

import java.io.File;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("D:/projetforlearn");
     //   System.out.println(file.length());

        File f1 = new File("D:\\projetforlearn\\code\\huangpu2\\javapromax\\src\\com\\itheima\\day1");
        System.out.println(f1.length());
        System.out.println(Arrays.toString(f1.listFiles()));

        System.out.println(f1.exists());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f1.getName());

    }
}
