package com.itheima.schoolwork.day9;

import java.io.*;
import java.text.DecimalFormat;

public class Question6 {
    public static void main(String[] args) {

        copy("D:\\note\\itheima1", "D:\\note\\itheima2");

    }

    public static void copy(String s, String s1) {
        File f = new File(s);
        File f1 = new File(s1);

        if (f.isDirectory()) {
            f1.mkdir();
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; i++) {
                copy(files[i].getPath(), f1.getAbsolutePath() + "\\" + files[i].getName());
            }
        } else if (f.getName().contains("java")){
            try (
                    BufferedInputStream bis
                            = new BufferedInputStream(new FileInputStream(f));
                    BufferedOutputStream bos
                            = new BufferedOutputStream(new FileOutputStream(f1));
            ) {
                byte[] buffer = new byte[1024];
                int len;
                while ((len = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, len);
                }



            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                File file = new File(f1.getAbsolutePath().substring(0, f1.getAbsolutePath().indexOf(".")) + ".txt");
                f1.renameTo(file);
            }
        }
    }
}
