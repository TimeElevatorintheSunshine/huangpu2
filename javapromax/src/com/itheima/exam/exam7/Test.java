package com.itheima.exam.exam7;



import java.util.*;

public class Test {
    public static List<People> peoples = new ArrayList<>();

    public static void main(String[] args) {

        Random r = new Random();
        for (int i = 1; i <= 100; i++) {
            while (true) {
                int data = r.nextInt(200) + 1;
                if (isCanUse(data)) {
                    peoples.add(new People(i, data));
                    break;
                }
            }
        }
        System.out.println(peoples);

        while (peoples.size() > 1) {
            // 干掉奇数位置处的人:那不就是留下偶数位置处的人吗？
            List<People> tempPeoples = new ArrayList<>();
            for (int i = 1; i < peoples.size(); i+=2) {
                People p = peoples.get(i);
                tempPeoples.add(p);
            }
            peoples = tempPeoples;
        }
        People luckPeople = peoples.get(0);
        System.out.println(luckPeople);

    }
    public static boolean isCanUse(int code){
        for (People people : peoples) {
            if(people.getId() == code) {
                return false; // 重复了，不能用
            }
        }
        return true; // 此编号，没有重复，可以使用！
    }

    }
      class People{
        private Integer number;
        private Integer id;

        @Override
        public String toString() {
            return
                    "number=" + number +
                    ", id=" + id
                    ;
        }

        public People() {
        }

        public People(Integer number, Integer id) {
            this.number = number;
            this.id = id;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
    }


