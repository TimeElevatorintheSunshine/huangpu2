package com.itheima.schoolwork.day5;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 某学校要组织学生参加活动，要求学生按照身高从小打大进行排队。
 * 请在素材的sort项目中的Entry类中补全相关的代码，模拟排队效果！程序运行效果如下所示：
 */
public class Question1 {

    public static void main(String[] args) {

        // 创建存储学生对象的数组，并且将学生对象添加到数组中
        Student[] students = new Student[5] ;
        students[0] = new Student("郭靖" , 175) ;
        students[1] = new Student("黄蓉" , 155) ;
        students[2] = new Student("黄药师" , 180) ;
        students[3] = new Student("欧阳锋" , 170) ;
        students[4] = new Student("穆念慈" , 160) ;

        // 调用sort方法排序
        sort(students);

        // 遍历集合
        for(int x = 0 ; x < students.length ; x++) {
            System.out.println(students[x]);
        }

    }

    // 排序方法
    public static void sort(Student[] students) {
        // 补全代码

        Arrays.sort(students, ( o1,  o2) ->  o1.getHeight()-o2.getHeight());



    }

}
class Student {          // 学生类

    private String name ;       // 学生姓名
    private int height ;        // 学生身高

    public Student(String name, int height) {      // 有参构造方法
        this.name = name;
        this.height = height;
    }

    // get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}