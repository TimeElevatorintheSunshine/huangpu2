package com.itheima.day1.test11.io4;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class ObjectInputStreamDemo1 {
    public static void main(String[] args) {
        try(            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\projetforlearn\\code\\huangpu2\\javapromax\\src\\com\\itheima\\day1\\note.txt"));

        ) {
            User u = (User)ois.readObject();
            System.out.println(u);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
