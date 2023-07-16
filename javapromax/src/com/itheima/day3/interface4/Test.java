package com.itheima.day3.interface4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //案例
        StudentData s = new StudentDataService1(); //多态
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("貂蝉","女",93));
        students.add(new Student("关羽","男",99));
        students.add(new Student("小乔","女",88));
        students.add(new Student("董卓","男",59));

        s.setStudent(students);
        s.printAll();
        s.printAverage();
    }
}
