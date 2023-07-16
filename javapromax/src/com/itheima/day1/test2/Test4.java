package com.itheima.day1.test2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
 *	学生的属性：学号，姓名，年龄。
 * 要求1：
 * 	再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
 * 要求2：
 * 	添加完毕之后，遍历所有学生信息。
 * 要求3：
 * 	通过id删除学生信息
 *         如果存在，则删除，如果不存在，则提示删除失败。
 * 要求4：
 * 	删除完毕之后，遍历所有学生信息。
 * 要求5：
 * 	查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
 */
public class Test4 {
    public static void main(String[] args) {
        Student[] students = {new Student("001","张三",12),new Student("002","李四",123),new Student("003","王五",44)};
        Student[] students1 = Arrays.copyOf(students, students.length + 1);
        System.out.println("请输入学号");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String id = sc.next();
            if (check(students1,id) == null){
                Student student = new Student();
                student.setId(id);
                System.out.println("请输入名字");
                student.setName(sc.next());
                System.out.println("请输入年龄");
                student.setAge(sc.nextInt());
                students1[students1.length-1] = student;
                break;
            }else {
                System.out.println("学号重复");
            }
        }
        System.out.println(Arrays.toString(students1));
        System.out.println("请输入删除学生的学号");
        String id = sc.next();
        if (check(students1,id) == null){
            System.out.println("学生不存在");
        }else {
            for (int i = 0; i < students1.length; i++) {
                if (students1[i].equals(check(students1,id))){
                    students1[i] = null;
                }
            }

        }
        System.out.println(Arrays.toString(students1));
        for (int i = 0; i < students1.length; i++) {
            if (students1[i].getId().contains("002")){
                students1[i].setAge(1);
                System.out.println(students1[i]);
                break;
            }
        }
    }
    public static Student check(Student[] student,String id){
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null) {
                if (student[i].getId().equals(id)){
                    return student[i];
                }
            }
        }
        return null;
    }
}
class Student{
    private String id;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}