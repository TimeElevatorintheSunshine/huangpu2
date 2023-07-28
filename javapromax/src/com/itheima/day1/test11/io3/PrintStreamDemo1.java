package com.itheima.day1.test11.io3;


import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        try(
                //  PrintStream ps = new PrintStream("D:\\projetforlearn\\code\\huangpu2\\javapromax\\src\\com\\itheima\\day1\\note.txt");
                PrintWriter ps = new PrintWriter(new FileOutputStream("D:\\projetforlearn\\code\\huangpu2\\javapromax\\src\\com\\itheima\\day1\\note.txt",true));


        ) {
            ps.println(97);
            ps.println("我爱你中国abc");
            ps.println(true);
            ps.println('a');
            ps.print(0.1);
            ps.write("我爱你中国abc");
            ps.write(97);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
