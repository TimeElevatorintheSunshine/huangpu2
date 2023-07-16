package com.itheima.day3.interface4;

import java.util.ArrayList;

public class StudentDataService1 implements StudentData {
    private ArrayList<Student> students;

    @Override
    public void printAll() {
        System.out.println("======第一套：打印全部学生信息=====");
        for (Student student :
                students) {
            System.out.println(student.getName() + student.getSex() + student.getScore());
        }
    }

    @Override
    public void printAverage() {
        System.out.println("=======第一套：打印平均分======");
        double scores = 0;
        for (Student student :
                students) {
            double score = student.getScore();
            scores += score;
        }
        System.out.println("平均分" + scores / students.size());
    }

    @Override
    public void setStudent(ArrayList<Student> students) {
        this.students = students;
    }
}
