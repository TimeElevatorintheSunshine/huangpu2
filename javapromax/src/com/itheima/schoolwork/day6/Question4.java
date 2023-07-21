package com.itheima.schoolwork.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 有4个人参加公务员考试,考试成绩如图所示,录取3名学生,淘汰分数最低的一名,设计一个程序,完成需求
 */
public class Question4 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("小亮",99));
        students.add(new Student("小强",85));
        students.add(new Student("小响",90));
        students.add(new Student("小勇",75));
        Collections.sort(students, (o1,o2)->o2.getScore()- o1.getScore());
        students.remove(students.size()-1);


        System.out.println(students);
    }
}
class Student{
    private String name;
    private int score;
    private String local;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", local='" + local + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public Student(String name, String local) {
        this.name = name;
        this.local = local;
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