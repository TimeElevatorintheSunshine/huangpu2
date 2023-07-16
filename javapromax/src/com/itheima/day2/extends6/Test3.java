package com.itheima.day2.extends6;

public class Test3 {
    public static void main(String[] args) {
        // 掌握子类调用父类构造器的应用场景
        Teacher t = new Teacher();
        t.setName("红太狼");
        t.setAge(22);
        t.setSkill("平底锅");

        Teacher t1 = new Teacher("灰太狼",25,"抓羊");
    }
}

class Teacher extends People{
    private String skill;

    public Teacher() {
    }

    public Teacher(String name, int age, String skill) {
        super(name,age);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
class People{
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
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