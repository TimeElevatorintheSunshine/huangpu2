package com.itheima.day9.file1;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File f = new File("D:\\projetforlearn\\heima\\基础加强14天课程");
        File f1 = new File("D:\\projetforlearn\\heima\\Java基础加强14天课程");
        String[] names = f.list();
        for (String name : names) {
            System.out.println(name);
        }

        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        f.renameTo(f1);
    }
}
