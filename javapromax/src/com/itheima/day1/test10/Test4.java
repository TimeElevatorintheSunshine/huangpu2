package com.itheima.day1.test10;

import java.io.File;
import java.util.Objects;

public class Test4 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\entertianment");
        File[] files = file.listFiles();
        f(files);



    }

    public static void f(File[] file) throws Exception {

        for (File file1 : file) {
            if (file1.isFile()) {
                if (file1.getName().equals("WeChat.exe")) {
                    Runtime runtime = Runtime.getRuntime();
                    runtime.exec("wechat");
                  return;
                }
            } else if (file1.isDirectory()) {
                File[] files = file1.listFiles();
                f(files);
            }
        }
    }
}
