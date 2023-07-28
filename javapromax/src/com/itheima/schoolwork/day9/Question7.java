package com.itheima.schoolwork.day9;

import java.io.*;

public class Question7 {

    public static void main(String[] args) {

        try (

                BufferedReader bfr = new BufferedReader(new FileReader("src/com/itheima/schoolwork/day9/note.txt"));

                BufferedWriter bfw = new BufferedWriter(new FileWriter("src/com/itheima/schoolwork/day9/note1.txt"));


        ) {
            for (int i = 0; i < 10; i++) {
                String len = bfr.readLine();
                if (len == null) {
                    len = "本软件只能免费使用3次,欢迎您注册会员后继续使用~";
                    bfw.write(len);
                    bfw.newLine();
                } else {
                    bfw.write(len);
                    bfw.newLine();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
