package com.itheima1.practice.day9.file;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        File file = new File("D:\\projetforlearn\\heima\\基础加强14天课程");
        File file2 = new File("D:\\projetforlearn\\heima\\基础加强14天课程java");

        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
        file.renameTo(file2);
    }
}
