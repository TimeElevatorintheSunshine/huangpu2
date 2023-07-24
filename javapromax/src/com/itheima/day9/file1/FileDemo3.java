package com.itheima.day9.file1;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args)throws Exception {
        File f = new File("D:\\note\\notes\\Java进阶\\cys.txt");
        // 1、public boolean createNewFile()：创建一个新文件（文件内容为空），创建成功返回true,反之。
        System.out.println(f.createNewFile());
        // 2、public boolean mkdir()：用于创建文件夹，注意：只能创建一级文件夹
        File f1 = new File("D:\\note\\aaa\\bbb\\ccc");
        System.out.println(f1.mkdir());
        // 3、public boolean mkdirs()(重点)：用于创建文件夹，注意：可以创建多级文件夹
        System.out.println(f1.mkdirs());
        // 4、public boolean delete()：删除文件，或者空文件，注意：不能删除非空文件夹。
//        System.out.println(f.delete());
//        System.out.println(f1.delete());

        File file = new File("E:/resource");
        System.out.println(file.delete());
    }
}
