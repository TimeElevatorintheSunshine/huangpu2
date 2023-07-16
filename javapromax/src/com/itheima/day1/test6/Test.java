package com.itheima.day1.test6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

public class Test {
    public static void main(String[] args) {
        double[] scores = {99.8,122.2,44.2};
       /* Arrays.setAll(scores, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return 0;
            }
        });*/
        Arrays.setAll(scores,(int value) ->scores[value] *0.8 );
        System.out.println(Arrays.toString(scores));


        Student[] students = {new Student("张三",22),new Student("李四",26),new Student("王五",24),new Student("赵六",21)};

        Arrays.sort(students,Test::compareByAge);
        System.out.println(Arrays.toString(students));
        Test test = new Test();
        Arrays.sort(students,test::compareByAge1);
        System.out.println(Arrays.toString(students));


    }
    public static int compareByAge(Student o1,Student o2){
        return o2.getAge() -o1.getAge();
    }
    public  int compareByAge1(Student o1,Student o2){
        return o1.getAge() -o2.getAge();
    }
}
class Student {//implements Comparable<Student>
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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


    /*@Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }*/
}