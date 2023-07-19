package com.itheima1.practice.day6.lambda1;



import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Double.compare;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // lambda 简化
        Integer[] arr = {11,22,33,44,55,66};
        Arrays.sort(arr,( o1, o2)->o1-o2);

        Student[] students = new Student[4];
        students[0] = new Student("喜羊羊", 12, "男", 122.2);
        students[1] = new Student("美羊羊", 11, "男", 115.3);
        students[2] = new Student("暖羊羊", 23, "男", 153.9);
        students[3] = new Student("沸羊羊", 16, "男", 162.6);


        Arrays.sort(students, (o1, o2)-> o1.getAge()-o2.getAge());

        System.out.println(Arrays.toString(students));
    }
}

class Student {
    private String name;
    private int age;
    private String gender;
    private double height;

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