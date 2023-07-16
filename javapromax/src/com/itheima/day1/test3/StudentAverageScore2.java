package com.itheima.day1.test3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StudentAverageScore2 implements StudentAverageScore{
    @Override
    public void printAll(ArrayList<Student> students) {
        System.out.println("--------------学生信息-------------");
        int count =0;
        for (Student student :students) {
            if (student.getSex().equals("男")){
                count++;
            }
            System.out.println(student);
        }
        System.out.println("男生个数" + count);
        System.out.println("女生个数" + (students.size() - count));
    }

    @Override
    public void printAverageAll(ArrayList<Student> students) {
        //Collections.sort(students,(Student o1, Student o2) -> o1.getScore() -o2.getScore());
        int sum = 0;
        Collections.sort(students);
        for (int i = 1; i < students.size()-1; i++) {
            sum += students.get(i).getScore();
        }
        System.out.println(sum * 1.0 /(students.size()-2));
    }
}
