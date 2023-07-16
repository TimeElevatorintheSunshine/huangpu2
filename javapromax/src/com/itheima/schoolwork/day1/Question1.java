package com.itheima.schoolwork.day1;

/**
 * 1.定义项目经理类
 * 	属性：
 * 		姓名 工号 工资 奖金
 * 	行为：
 * 		工作work
 * 2.定义程序员类
 * 	属性：
 * 		姓名 工号 工资
 * 	行为：
 * 		工作work
 * 3.要求:向上抽取一个父类,让这两个类都继承这个父类,共有的属性写在父类中，子类重写父类中的方法
 * 	编写测试类:完成这两个类的测试
 */
public class Question1 {
    public static void main(String[] args) {
        Manger manger = new Manger("张三","heima001",13000,2000);
        manger.work();
        Programmer programmer = new Programmer("李四","heima003",15000);
        programmer.work();
    }
}
class Programmer extends  Staff{
    public Programmer() {
    }

    public Programmer(String name, String id, Integer salary) {
        super(name, id, salary);
    }

    public void work(){
        System.out.println("工号为" + id + "的" + name + "程序员，拿着" +salary + "的工资，正在苦逼的写代码");
    }
}
class Manger extends Staff{
    private Integer bonus;

    public Manger() {
    }


    public Manger(String name, String id, Integer salary, Integer bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("工号为" + id + "的" + name + "项目经理，拿着" +salary + "的工资和，" +bonus + "的奖金，正盯着程序员写代码");
    }
}
class Staff{
    public String name;
    public String id;
    public Integer salary;
        public void work(){}
    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Staff() {
    }

    public Staff(String name, String id, Integer salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


}