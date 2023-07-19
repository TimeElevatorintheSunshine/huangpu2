package com.itheima1.practice.day6.method1;

import java.util.Arrays;

public class MethodDemo1 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("喜羊羊", 12, "男", 122.2);
        students[1] = new Student("美羊羊", 11, "男", 115.3);
        students[2] = new Student("暖羊羊", 23, "男", 153.9);
        students[3] = new Student("沸羊羊", 16, "男", 162.6);
        MethodDemo1 methodDemo1 = new MethodDemo1();

        Arrays.sort(students,methodDemo1::CompareByHeight);

    }
    public int CompareByHeight(Student o, Student o1){
        return Double.compare(o.getHeight(),o1.getHeight());
    }
}
