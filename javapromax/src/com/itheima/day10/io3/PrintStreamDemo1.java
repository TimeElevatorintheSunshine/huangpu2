package com.itheima.day10.io3;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        try(
                PrintStream ps = new PrintStream("src/com/itheima/day10/note.txt");
                PrintWriter pw = new PrintWriter("src/com/itheima/day10/note.txt")
        ){

            ps.println(96);
            ps.println('a');
            ps.println("哇啊哇");
            ps.println(96.0);
            ps.println(true);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
