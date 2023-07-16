package com.itheima1.practice.day3.interface4;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        StudentData s = new StudentDataService1();
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三",99,"男"));
        students.add(new Student("李四",58,"女"));
        students.add(new Student("王五",100,"男"));
        students.add(new Student("田七",77,"女"));
        students.add(new Student("赵六",62,"女"));
        students.add(new Student("周八",95,"男"));
        s.setStudents(students);
        s.printAllStudent();
        s.printAverage();
    }
}
class StudentDataService1 implements StudentData{
    private ArrayList<Student> students;
    @Override
    public void printAllStudent() {
        System.out.println("=====plan2:全部学生====");
        int count = 0;
        for (Student student : students) {
            System.out.println(student.getName() + student.getScore() + student.getSex());
            if (student.getSex().equals("男"))count++;
        }
        System.out.println("男生" + count);
        System.out.println("女生" +(students.size()- count));
    }

    @Override
    public void printAverage() {
        System.out.println("=====plan2:平均分======");
        double scores = 0;
        double max;
        double min = max = students.get(0).getScore();
        for (Student student : students) {
            double score = student.getScore();
            scores += score;
            if (max < student.getScore())max = student.getScore();
            if (min > student.getScore())min = student.getScore();
        }
        System.out.println("最高分 " + max);
        System.out.println("最低分 " + min);
        System.out.println("平均分是" + (scores-max-min) / (students.size()-2));
    }

    @Override
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
class StudentDataService implements StudentData {
    private ArrayList<Student> students;

    @Override
    public void printAllStudent() {
        System.out.println("=====plan1:全部学生====");
        for (Student student : students) {
            System.out.println(student.getName() + student.getScore() + student.getSex());
        }
    }

    @Override
    public void printAverage() {
        System.out.println("=====plan1:平均分=======");
        double scores = 0;
        for (Student student : students) {
            double score = student.getScore();
            scores += score;
        }
        System.out.println("平均分是" + scores / students.size());
    }

    @Override
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}

interface StudentData {
    void printAllStudent();

    void printAverage();

    void setStudents(ArrayList<Student> students);
}

class Student {
    private String name;
    private double score;
    private String sex;

    public Student() {
    }

    public Student(String name, double score, String sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}