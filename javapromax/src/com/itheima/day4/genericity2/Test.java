package com.itheima.day4.genericity2;

public class Test {
    public static void main(String[] args) {
        // 泛型接口
    }
}
class Student{}
class StudentData implements Data<Student>{

    @Override
    public void add(Student student) {

    }

    @Override
    public void upDate(Student student) {

    }

    @Override
    public Student getId(int id) {
        return null;
    }

    @Override
    public void delete(Student student) {

    }
}
interface Data<E>{
    void add(E e);
    void upDate(E e);
    E getId(int id);
    void delete(E e);
}