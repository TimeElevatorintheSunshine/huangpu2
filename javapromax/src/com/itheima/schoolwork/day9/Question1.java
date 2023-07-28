package com.itheima.schoolwork.day9;

import java.io.File;

public class Question1 {
    public static void main(String[] args) {
        File file2 = new File("D:/aaa");
        System.out.println(file2.mkdirs());
        f(file2);
    }

    public static void f(File file) {
        if (!file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                f(file1);
            }
        }
        file.delete();
    }

    public static void deleteDir(File file) {
        // 极端判断
        if (file == null || !file.exists()) return;
        // 判断是不是文件
        if (file.isFile()) {
            file.delete();
            return;
        }
        // 获取一级文件对象
        File[] files = file.listFiles();
        if (files == null) {
            return;
        }
        if (files.length > 0) {
            for (File file1 : files) {
                if (file1.isFile()) {
                    file1.delete();
                } else {
                    deleteDir(file1);
                }
            }
        }
        file.delete();
    }
}
