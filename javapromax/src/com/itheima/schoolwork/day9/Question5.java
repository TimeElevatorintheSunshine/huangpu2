package com.itheima.schoolwork.day9;

import java.io.*;
import java.text.DecimalFormat;

public class Question5 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\m1343\\Desktop\\Document\\aaa.png");
        int a =(int) f.length();

        try (

                BufferedInputStream bis
                        = new BufferedInputStream(new FileInputStream(f));
                BufferedOutputStream bos
                        = new BufferedOutputStream(new FileOutputStream("C:\\Users\\m1343\\Desktop\\Document\\aaa1.png"));

        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
                DecimalFormat df = new DecimalFormat("##%");

                String format = df.format(len * 1.0 / a);
                System.out.println(f.getName() +"复制了"+format);

                a = a-len;
            }
            System.out.println(f.getName() + "复制完毕");
             // 30%

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
