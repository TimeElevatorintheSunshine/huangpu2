package com.itheima1.practice.day9.file;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\m1343\\Desktop\\Document\\aaa.png");
        // 2、public boolean exists()：判断当前文件对象，对应的文件路径是否存在，存在返回true.
        System.out.println(f.exists());
        // 3、public boolean isFile() : 判断当前文件对象指代的是否是文件，是文件返回true，反之。
        System.out.println(f.isFile());
        // 4、public boolean isDirectory()  : 判断当前文件对象指代的是否是文件夹，是文件夹返回true，反之。
        System.out.println(f.isDirectory());
        // 5.public String getName()：获取文件的名称（包含后缀）
        System.out.println(f.getName());
        // 6.public long length()：获取文件的大小，返回字节个数
        System.out.println(f.length());
        // 7.public long lastModified()：获取文件的最后修改时间。
        long l = f.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        String format = sdf.format(l);
        System.out.println(format);

        // 8.public String getPath()：获取创建文件对象时，使用的路径
        System.out.println(f.getPath());
        // 9.public String getAbsolutePath()：获取绝对路径.
        System.out.println(f.getAbsolutePath());

        //   File file = new File("");  // 定位相对路径
        //    System.out.println(file.getAbsolutePath());
    }
}
