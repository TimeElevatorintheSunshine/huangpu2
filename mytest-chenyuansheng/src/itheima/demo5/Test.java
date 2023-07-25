package itheima.demo5;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyArrList<String> s = new MyArrList<>();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.forEach(System.out::print);
        System.out.println();
        s.add(3,"6");
        s.forEach(System.out::print);
        System.out.println();
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("4");
        s2.add("5");
        s.addAll(s2);
        s.forEach(System.out::print);

    }
}
