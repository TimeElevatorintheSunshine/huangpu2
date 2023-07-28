package com.itheima.day10.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferedReaderDemo1 {
    public static void main(String[] args) {
        try (
                BufferedReader br
                        = new BufferedReader(new FileReader("src/com/itheima/day10/note1.txt"));
                BufferedWriter bw
                        = new BufferedWriter(new FileWriter("src/com/itheima/day10/note.txt"));

        ){
            List<String> s = new ArrayList<>();
            String len;
            // 按照行都字符的功能
            while ((len = br.readLine() ) != null){
                s.add(len);
            }
          // Collections.shuffle(s);
          //  s.sort((o1,o2)->o1.charAt(0)-o2.charAt(0));
            Collections.sort(s);
            for (String s1 : s) {
                bw.write(s1);
                bw.newLine(); // 换行
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
