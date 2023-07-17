package com.itheima.day4.genericity3;

import com.itheima.day3.interface4.Student;

public class Test {
    public static void main(String[] args) {
        // 泛型方法
        // 可以打印任意类型数组的内容
        String[] names = {"张三","李四","王五"};
        printArray(names);

        Student[] student = new Student[7];
        printArray(student);
    }

    public static <E> void printArray(E [] e) {

    }
}
