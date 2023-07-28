package com.itheima.day10.io1;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo3 {
    public static void main(String[] args) {
        File file = new File("src/com/itheima/day10/note1.txt");
        try (
               InputStream is
                        = new FileInputStream(file);
        ){
//            long length = file.length();
//            byte[] buffer = new byte[(int)length];
//
//            int len;
//            while ((len = is.read(buffer)) != -1){
//                String s = new String(buffer, 0, len); // 读取多少倒出多少
//                System.out.print(s);
            byte[] bytes = is.readAllBytes();
            System.out.println(new String(bytes));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
