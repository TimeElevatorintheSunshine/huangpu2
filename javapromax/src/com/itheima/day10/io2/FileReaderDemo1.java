package com.itheima.day10.io2;

import java.io.FileReader;

public class FileReaderDemo1 {
    public static void main(String[] args) {
        // 创建一个文件字符输入流与源文件接通

        try (
                FileReader fr = new FileReader("src/com/itheima/day10/note.txt");
        ) {
            // 每次读取一个字符的编号，如果没有字符可都返回-1
//            int c;
//            while ((c = fr.read()) != -1){
//                System.out.print((char) c);
//            }

            // 读取字符数组这么多字符，返回每次读取了多少个字符，如果没有字符可读返回-1
            // 优点，读取汉字不会乱码！性能好
            char[] chars = new char[3];
            int len;
            while ((len = fr.read(chars)) != -1){
                String s = new String(chars, 0, len);
                System.out.print(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
