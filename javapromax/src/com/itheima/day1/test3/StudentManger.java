package com.itheima.day1.test3;

import java.util.ArrayList;
import java.util.Collections;

public class StudentManger {
     private  ArrayList<Student> students = new ArrayList<>();
private    StudentAverageScore s = new StudentAverageScore2();
    public StudentManger() {
        Student s = new Student("张三","男",99);
        Student s1 = new Student("李四","女",96);
        Student s2 = new Student("赵武","男",79);
        Student s3= new Student("陈七","女",89);
        Collections.addAll(students,s,s1,s2,s3);
    }
    public void print(){
        s.printAll(students);
    }
    public void printAverage(){
        s.printAverageAll(students);
    }
}
