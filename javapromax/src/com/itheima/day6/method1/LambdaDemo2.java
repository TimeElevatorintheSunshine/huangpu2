package com.itheima.day6.method1;



import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Double.compare;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 静态方法引用
        Student[] students = new Student[4];
        students[0] = new Student("喜羊羊", 12, "男", 122.2);
        students[1] = new Student("美羊羊", 11, "男", 115.3);
        students[2] = new Student("暖羊羊", 23, "男", 153.9);
        students[3] = new Student("沸羊羊", 16, "男", 162.6);


        Arrays.sort(students,Student::compareByHeight);
        System.out.println(Arrays.toString(students));

    }
}

class Student {
    private String name;
    private int age;
    private String gender;
    private double height;
    public static int compareByHeight(Student o1,Student o2){
        return Double.compare(o1.getHeight(), o2.getHeight());
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