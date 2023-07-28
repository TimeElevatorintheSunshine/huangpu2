package com.itheima.day1.test12.xml1;

import java.util.*;


public class Test3 {
    public static void main(String[] args) {
        People p1 = new People("张全蛋儿", "农家乐,野外拓展");
        People p2 = new People("李二狗子", "轰趴,野外拓展,健身房");
        People p3 = new People("翠花", "野外拓展");
        People p4 = new People("小帅", "轰趴,健身房");
        People p5 = new People("有容", "农家乐");
        List<People> peoples = new ArrayList<>();
        Collections.addAll(peoples,p1,p2,p3,p4,p5);
        Map<String, Integer> local = new HashMap<>();
        for (People people : peoples) {
            String[] split = people.getLocal().split(",");
            for (String s : split) {
                local.put(s,local.containsKey(s)?local.get(s)+1:1);
            }
        }

    }
}
class People{
    private String name;
    private String local;

    public People() {
    }

    public People(String name, String local) {
        this.name = name;
        this.local = local;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
