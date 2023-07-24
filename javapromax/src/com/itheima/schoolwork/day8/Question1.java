package com.itheima.schoolwork.day8;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.File;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // 1. 键盘录入一个新文件夹路径判断该路径是否存在
        File file = new File("D:/aaa");
        //  System.out.println(file.mkdir());
        // 2. 键盘录入一个路径，并将该路径指向的文件或文件夹删除；【别瞎玩】
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个路径");
        File file1 = new File(sc.next());
        //   file1.delete();
        // 3. 获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
        File file2 = new File("javapromax\\src\\com\\itheima\\day1\\test1");
        String[] list = file2.list();
        for (String s : list) {
            if (s.contains("java")){
            System.out.println(s);}
        }
        //  统计任意一个文件夹的大小 （length()方法可以获取文件的大小）
        File file3 = new File("D:/entertianment");
        System.out.println(file3.length());
        // 键盘录入一个路径，将指定路径下的小于200K的小文件，并打印
        File[] files = file2.listFiles();
        for (File file4 : files) {
            if (file4.length()<(200*1024)){
                System.out.println(file4.getName());
            }
        }


    }
}
