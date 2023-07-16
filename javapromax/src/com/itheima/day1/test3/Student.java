package com.itheima.day1.test3;

public class Student implements Comparable<Student>{
    private String name;
    private String sex;
    private int score;

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", score=" + score ;
    }

    public Student() {
    }

    public Student(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o1) {
        return this.getScore()-o1.getScore();
    }
}
