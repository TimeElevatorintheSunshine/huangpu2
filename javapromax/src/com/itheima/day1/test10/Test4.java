package com.itheima.day1.test10;

import java.io.File;
import java.util.Objects;

public class Test4 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\entertianment\\wechat");
        File[] files = file.listFiles();
        f(files);


//       File[] files = file.listFiles();
//        for (int i = 0; i < files.length; i++) {
//            System.out.println(files[i]);
//        }
    }

    public static void f(File[] file) throws Exception {
//        for (int i = 0; i < file.length; i++) {
//            System.out.print(file[i].getName());
//        }
        for (File file1 : file) {
            if (file1.isFile()) {
                if (file1.getName().equals("WeChat.exe")) {
                    Runtime runtime = Runtime.getRuntime();
                    runtime.exec("D:\\entertianment\\wechat\\[3.9.5.81]\\wechat");
                  return;
                }
            } else if (file1.isDirectory()) {

                File[] files = file1.listFiles();
                f(files);
            }
        }
    }
}
