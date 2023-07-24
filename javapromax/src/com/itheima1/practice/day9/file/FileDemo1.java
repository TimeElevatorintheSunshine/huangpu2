package com.itheima1.practice.day9.file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        // 目标：掌握File对象的创建，来代表具体的文件。
        // 1、创建File对象
        File f1= new File("D:\\projetforlearn\\code\\huangpu2\\javapromax\\src\\com\\itheima\\day9\\file1\\note.txt");
        // File f1 = new File("E:/resource/aaa.png");
        // File f1 = new File("E:" + File.separator + "resource" + File.separator + "aaa.png");
        System.out.println(f1.length());

        // 2、File对象可以代表文件，也可以代表文件夹。
        File f2 = new File("D:\\projetforlearn\\code");
        System.out.println(f2.exists());


        // 3、File对象代表的文件路径可以是不存在的
        File f3 = new File("E:\\resource22");
        System.out.println(f3.exists());

        // 4、File对象的路径可以支持绝对路径，相对路径。
        // 什么是绝对路径？ 从磁盘的根路径开始一路寻找的路径。
        File f4 = new File("D:\\projetforlearn\\code\\huangpu2\\javapromax\\src\\com\\itheima\\day9\\file1\\note.txt");

        // 什么是相对路径？ （重点）
        // 默认相对到当前工程下寻找文件的。
        // 说白了不带盘符，直接到project（工程）下找文件
        // 相对路径一般是用于找模块中的文件的。
        File f5 = new File("javapromax\\src\\com\\itheima\\day9\\file1\\note.txt");
        System.out.println(f5.length());
    }
}
