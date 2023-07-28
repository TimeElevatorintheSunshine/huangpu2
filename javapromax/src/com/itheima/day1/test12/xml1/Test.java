package com.itheima.day1.test12.xml1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    private static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        try(
                BufferedReader br
                        = new BufferedReader(new FileReader("src/com/itheima/day1/note.txt"));

        ){
            String len;
            while ((len = br.readLine() )!=null){
                list.add(len);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        try(
                BufferedWriter bw
                        = new BufferedWriter(new FileWriter("src/com/itheima/day1/note1.txt"));

        ){
            Collections.sort(list);
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
