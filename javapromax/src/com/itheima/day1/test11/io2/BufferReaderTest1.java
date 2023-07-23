package com.itheima.day1.test11.io2;

import java.io.*;

public class BufferReaderTest1 {
    public static void main(String[] args) throws Exception {
        try (
                FileReader fr = new FileReader("javapromax\\src\\com\\itheima\\day1\\note.txt");
                BufferedReader bfr = new BufferedReader(fr);

                FileWriter fw = new FileWriter("javapromax\\src\\com\\itheima\\day1\\notecopy");
                BufferedWriter bfw = new BufferedWriter(fw);
        ) {
            String line;
            while ((line = bfr.readLine()) != null) {
                bfw.write(line);
                bfw.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
