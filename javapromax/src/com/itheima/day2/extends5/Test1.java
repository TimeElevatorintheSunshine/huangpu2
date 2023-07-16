package com.itheima.day2.extends5;

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("喜羊羊");
        s.setAge(25);
        System.out.println(s.toString());  // 输出对象，默认调用Object的toString方法，默认返回地址
        System.out.println(s);
    }
}
class Student{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
}