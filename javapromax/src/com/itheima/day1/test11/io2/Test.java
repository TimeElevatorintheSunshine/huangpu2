package com.itheima.day1.test11.io2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        try (
             BufferedReader bis = new BufferedReader( new FileReader("javapromax\\src\\com\\itheima\\day1\\note.txt"));
             BufferedWriter bos = new BufferedWriter(new FileWriter("javapromax\\src\\com\\itheima\\day1\\notecopy.txt"));
             ){
            List<String> s = new ArrayList<>();
            String word;
            while ((word = bis.readLine()) != null){
                s.add(word);
            }
            System.out.println(s);
            for (String s1 : s) {
                bos.write(s1);
                bos.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
