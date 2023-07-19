package com.itheima.day6.arrays1;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("喜羊羊", 12, "男", 122.2);
        students[1] = new Student("美羊羊", 11, "男", 115.3);
        students[2] = new Student("暖羊羊", 23, "男", 153.9);
        students[3] = new Student("沸羊羊", 16, "男", 162.6);

        // 自定义排序规则方式一 实现比较接口Comparable,重写compareTo方法
       Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        // 自定义排序规则方式二 sort存在重载方法，支持自带Comparator比较强器

        Arrays.sort(students,(o1, o2)->Double.compare(o1.getHeight(), o1.getHeight()));


    }
}
class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String gender;
    private double height;
    @Override
    public int compareTo(Student o) {
        // 官方规定
        // 比较者 ：this
        // 被比较者 ：o
        // this > o ,请返回正整数
        // this < o ,请返回负整数
        // this = o ，请返回0
        return this.age - o.age; // 升序
       // return o.age - this.age; // 降序
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age, String gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}