package com.itheima.day9.file1;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("D:\\projetforlearn\\heima\\基础加强14天课程\\全部PPT");
        String[] list = file.list();
        int a = 25;
        File[] files = file.listFiles();
//        for (File file1 : files) {
//            File file2 = new File("D:\\projetforlearn\\heima\\基础加强14天课程\\全部PPT\\day" + (a++) + list[a - 26].substring(5));
//            file1.renameTo(file2);
//        }
        System.out.println(file.getName());
        for (File file1 : files) {
            String name = file1.getName();
            File file2 = new File(file.getName(), name.replaceFirst("[0-9]{2,}", "" + a++));
            file1.renameTo(file2);
        }
    }
}
