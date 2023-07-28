package com.itheima.schoolwork.day10;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question2 {
    private static Scanner sc = new Scanner(System.in);
    private static File file = new File("D:\\songs");

    public static void main(String[] args) {
        start();

    }

    private static void start() {
        while (true) {
            System.out.println("请选择以下操作");
            System.out.println("1.查询所有歌曲");
            System.out.println("2.根据歌曲名称复制");
            System.out.println("3.根据歌曲名称删除");
            System.out.println("4.退出");
            Integer command = sc.nextInt();
            switch (command) {
                case 1:
                    query();
                    break;
                case 2:
                    copy();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    return;
                default:

            }
        }
    }

    private static void delete() {
        System.out.println("请输入要删除的歌曲名称:");
        String name = sc.next();
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.getName().contains(name)) {
                file1.delete();
                System.out.println("歌曲" + name + "已经成功删除");
                break;
            }
        }
        System.out.println("您输入的歌名不存在!");

    }

    private static void copy() {
        System.out.println("请输入要复制的歌曲名称:");
        String name = sc.next();
        System.out.println("请输入存储路径:");
        String path = sc.next();
        File file1 = new File(path);
        File file2 = new File(file.getAbsoluteFile(), name);
        try {
            FileUtils.copyFileToDirectory(file2, file1);
            System.out.println("歌曲" + name + "已经成功复制到" + path + "目录中");

        } catch (IOException e) {
            System.out.println("您输入的歌名不存在!");
        }
    }


     private static void query() {
        String[] list = file.list();
        System.out.println("存在以下歌曲:");
        for (String s : list) {
            System.out.println("\t" + s.substring(0, s.indexOf(".")));
        }
    }

}
