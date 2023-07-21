package com.itheima.day1.test10;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class Test1 {
    public static void main(String[] args)throws Exception {
        File file = new File("D:/projetforlearn");
     //   System.out.println(file.length());

        File f1 = new File("D:\\projetforlearn\\code\\huangpu2\\javapromax\\src\\com\\itheima\\day1");
        System.out.println(f1.length());
        System.out.println(Arrays.toString(f1.listFiles()));

        System.out.println(f1.exists());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f1.getName());
        System.out.println(f1.lastModified());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        File file1 = new File("D:\\adv");
      //  System.out.println(file1.createNewFile());
        System.out.println(file1.delete());
        File file2 = new File("D:\\adv");
      //  System.out.println(file2.mkdir());
       // System.out.println(file2.mkdirs());
        System.out.println(file2.delete());

        File file3 = new File("D:\\projetforlearn");
        String[] list = file3.list();
        System.out.println(Arrays.toString(list));
        File[] files = file3.listFiles();
        System.out.println(Arrays.toString(files));
    }
}
