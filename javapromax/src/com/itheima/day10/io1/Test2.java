package com.itheima.day10.io1;

import java.io.FileOutputStream;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test2 {
    public static void main(String[] args) {
        try (
                OutputStream os = new FileOutputStream("src/com/itheima/day10/note.txt");

                ){
            byte[] buffer = Files.readAllBytes(Paths.get("src\\com\\itheima\\day10\\note1.txt"));

            os.write(buffer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
