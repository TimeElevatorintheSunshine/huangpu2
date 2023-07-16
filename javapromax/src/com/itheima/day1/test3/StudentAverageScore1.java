package com.itheima.day1.test3;

import java.util.ArrayList;

public class StudentAverageScore1  implements StudentAverageScore{
    @Override
    public void printAll(ArrayList<Student> students) {
        System.out.println("--------------学生信息-------------");
        for (Student student :students) {
            System.out.println(student);
        }
    }

    @Override
    public void printAverageAll(ArrayList<Student> students) {
        int sum = 0;
        for (Student student :students) {
            sum +=student.getScore();
        }
        System.out.println(sum * 1.0/students.size());
    }


}
