package com.itheima.day3.interface4;

import java.util.ArrayList;

public class StudentDataService2 implements StudentData{
    private ArrayList<Student> students;
    @Override
    public void printAll() {
        System.out.println("======第一套：打印全部学生信息=====");
        int count = 0;
        for (Student student :
                students) {
            System.out.println(student.getName()+student.getSex()+student.getScore());
            if (student.getSex().equals("男"))count++;
        }
        System.out.println("男生" + count + "个");
        System.out.println("女生" + (students.size()-count) + "个");
    }

    @Override
    public void printAverage() {
        System.out.println("=======第一套：打印平均分======");
        double scores = 0;
        double max;
        double min = max = students.get(0).getScore();
        for (Student student :
                students) {
           double score = student.getScore();
           scores += score;
           if (max < student.getScore())max = student.getScore();
           if (min > student.getScore())min = student.getScore();
        }
        System.out.println("最高分" + max);
        System.out.println("最低分" + min);
        System.out.println("平均分" + (scores-max-min)/(students.size()-2));
    }

    @Override
    public void setStudent(ArrayList<Student> students) {
        this.students = students;
    }
}
