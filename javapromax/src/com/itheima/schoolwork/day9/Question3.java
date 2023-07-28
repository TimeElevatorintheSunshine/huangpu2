package com.itheima.schoolwork.day9;

import java.io.*;

public class Question3 {
    public static void main(String[] args) {

        copy("D:\\note\\notes", "D:\\note\\notes1");

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
        } else if (f.isFile()) {
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
            }
        }
    }

    /**
     * 拷贝文件夹
     */
    public static void copyDirToDir(File srcDir, File destDir) {
        // 极端判断
        if (srcDir == null || destDir == null || !srcDir.exists() || !destDir.exists()) return;
        // 两个都是文件夹
        if (srcDir.isDirectory()&& destDir.isDirectory()){
            // 开始拷贝
            // 在目的地创建一个一模一样的文件夹
            File destDirFile = new File(destDir, srcDir.getName());
            destDirFile.mkdirs();
            // 获取文件夹全部一级文件对象
            File[] files = srcDir.listFiles();
            if (files != null && files.length >0){
                for (File file : files) {
                    if (file.isFile()){
                        // 是文件直接拷贝
                        copyFileToFile(file,new File(destDirFile,file.getName()));
                    }else {
                        // 是文件夹
                        copyDirToDir(file,destDirFile);
                    }
                }
            }
        }
    }

    private static void copyFileToFile(File file, File file1) {
        try (
                BufferedInputStream bis
                        = new BufferedInputStream(new FileInputStream(file));
                BufferedOutputStream bos
                        = new BufferedOutputStream(new FileOutputStream(file1));
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
