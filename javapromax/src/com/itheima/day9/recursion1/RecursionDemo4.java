package com.itheima.day9.recursion1;

import java.io.File;

public class RecursionDemo4 {
    public static void main(String[] args) {
        File file = new File("D:\\entertianment");
        searchFile(file,"WeChat");
    }

    private static void searchFile(File file, String s) {
        if (file == null || s == null||!file.exists() || file.isFile()){
            return;
        }

        File[] files = file.listFiles();

        if (files != null&&files.length>0){
            for (File file1 : files) {
                if (file.isFile()){
                    if (file.getName().contains(s)){
                        System.out.println(file.getAbsolutePath());
                    }
                }else {
                    searchFile(file,s);
                }
            }
        }
    }
}
