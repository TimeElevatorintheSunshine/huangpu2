package com.itheima1.practice.day9.recursion1;

import java.io.File;
import java.io.IOException;

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
                if (file1.isFile()){
                    if (file1.getName().contains(s)){
                        try {
                            Runtime runtime = Runtime.getRuntime();
                            runtime.exec("wechat");
                            return;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }else {
                    searchFile(file1,s);
                }
            }
        }
    }
}
