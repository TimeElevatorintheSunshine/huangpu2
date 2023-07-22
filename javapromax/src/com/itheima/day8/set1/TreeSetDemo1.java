package com.itheima.day8.set1;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        // TreeSet集合排序
        TreeSet<Integer> sets = new TreeSet<>();
        sets.add(12);
        sets.add(2);
        sets.add(20);
        System.out.println(sets);

        TreeSet<Dog> dogs = new TreeSet<>((o1, o2) -> Double.compare(o1.getHeight(),o2.getHeight()));



        dogs.add(new Dog("泰迪",22,111));
        dogs.add(new Dog("金毛",16,125));
        dogs.add(new Dog("藏獒",27,156));
        dogs.add(new Dog("中华田园犬",22,131.9));
        System.out.println(dogs);

    }
}
class Dog implements Comparable<Dog> {
    private String name;
    private int age;
    private double height;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public Dog() {
    }

    public Dog(String name, int age, double height) {
        this.name = name;
        this.age = age;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(Dog o) {
        return this.age - o.getAge() ;
    }
}