package com.itheima.day1.test4;

public class Test1 {
    public static void main(String[] args) {
        Swimming s1 = new Swimming() {
            @Override
            public void swimming() {
                System.out.println("狗游得快");
            }
        };

        Swimming s2 = () -> System.out.println("猫游得慢");
        go(s2);


    }

    public static void go(Swimming s) {
        s.swimming();
    }
}

interface Swimming {
    void swimming();
}
