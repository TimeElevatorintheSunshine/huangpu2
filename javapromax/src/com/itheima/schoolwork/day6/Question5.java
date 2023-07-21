package com.itheima.schoolwork.day6;

import java.util.ArrayList;

/**
 * 如图,表格中是三年级一班的学生信息,后来张三丰移民到了山东,李老师需要将张三丰对应的住址改掉,请用程序完成需求,并将学生的信息打印到控制台上
 */
public class Question5 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张无忌","河北"));
        students.add(new Student("张三丰","河南"));
        students.add(new Student("赵敏","蒙古"));
        students.add(new Student("周芷若","四川"));
        for (Student student : students) {
            if (student.getName().contains("张三丰")){
                student.setLocal("山东");
            }
        }
        System.out.println(students);
    }
}
