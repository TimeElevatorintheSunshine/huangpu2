package com.itheima.day8.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections1 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        // 批量添加数据
        Collections.addAll(l, "java1", "java2", "java3", "java4", "java5");
        System.out.println(l);
        // 打乱顺序
        Collections.shuffle(l);
        System.out.println(l);

        // 排序
        List<Double> l1 = new ArrayList<>();
        Collections.addAll(l1, 33.3, 26.1, 67.2, 54.6);
        Collections.sort(l1);
        System.out.println(l1);
        // 自定义排序
        List<Student> l2 = new ArrayList<>();
        l2.add(new Student("喜羊羊", 12, "男", 122.2));
        l2.add(new Student("美羊羊", 11, "男", 115.3));
        l2.add(new Student("暖羊羊", 23, "男", 153.9));
        l2.add(new Student("沸羊羊", 16, "男", 162.6));
        // 对象的类实现Comparable接口，重写compareTo方法
        Collections.sort(l2);
        System.out.println(l2);
        // 指定Comparator比较器对象，在指定比较规则
        Collections.sort(l2,((o1, o2) -> Double.compare(o1.getHeight(),o2.getHeight())));
        System.out.println(l2);
    }
}

class Student implements Comparable<Student> {
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


    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}