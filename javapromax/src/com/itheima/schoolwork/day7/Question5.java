package com.itheima.schoolwork.day7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Question5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        //2.创建4个学生对象
        Student s1 = new Student(1, "小亮", 99);
        Student s2 = new Student(2, "小勇", 85);
        Student s3 = new Student(3, "小响", 90);
        Student s4 = new Student(4, "小强", 89);
        Collections.addAll(list,s1,s2,s3,s4);
        list.sort(( o1,  o2) ->o1.getScore()- o2.getScore());
        System.out.println(list);


    }
}
class Student{
    private int id;
    private String name;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Student() {
    }

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}