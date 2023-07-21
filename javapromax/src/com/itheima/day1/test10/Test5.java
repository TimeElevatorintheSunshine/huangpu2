package com.itheima.day1.test10;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        File file2 = new File("D:/aaa");
       System.out.println(file2.mkdirs());
        f(file2);
    }
    public static void f(File file){
            if (file.isFile()){
                file.delete();
            }else if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File file1 : files) {
                    f(file1);
                }
            }
            file.delete();
    }
}
