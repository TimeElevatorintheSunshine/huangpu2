package com.itheima.schoolwork.day8;

import java.io.File;

public class Question4 {
    public static void main(String[] args) {
        File file = new File("javapromax\\src\\com");
        search(file,"java");
    }

    private static void search(File file, String name) {
        if (file == null || name == null||!file.exists() || file.isFile()){
            return;
        }
        File[] files = file.listFiles();

        if(files == null || files.length == 0){
            return;
        }


            for (File file1 : files) {
                if (file1.isFile()){
                    if (file1.getName().contains(name)){
                        System.out.println(file1.getAbsolutePath());

                        return;
                    }
                }else {
                    search(file1,name);
                }
            }

    }

}
