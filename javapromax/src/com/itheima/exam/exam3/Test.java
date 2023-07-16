package com.itheima.exam.exam3;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> s = new MyArrayList<>();
        s.add("java");
        s.add("java1");
        s.add("java2");
        s.add("java3");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.remove(2));
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.get(2));
        s.foreach(System.out::println);
        System.out.println(s.get(22));
    }
}
