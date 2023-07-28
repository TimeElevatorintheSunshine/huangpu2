package com.itheima.day10.io4;

import com.itheima.day1.test11.io4.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo1 {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/itheima/day10/note.txt"));

        ) {
            User u = (User)ois.readObject();
            System.out.println(u);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}