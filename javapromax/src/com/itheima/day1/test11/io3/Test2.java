package com.itheima.day1.test11.io3;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test2 {
    public static void main(String[] args) {


        try (
                PrintStream ps = new PrintStream("D:\\projetforlearn\\code\\huangpu2\\javapromax\\src\\com\\itheima\\day1\\note.txt");

        ){
            System.setOut(ps);
            System.out.println("老骥伏枥");
            System.out.println("志在千里");
            System.out.println("烈士暮年");
            System.out.println("壮心不已");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
