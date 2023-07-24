package com.itheima.day9.stream1;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        // stream流
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.stream().filter(s -> s.startsWith("张")&& s.length()==3).forEach(s -> System.out.println(s));


    }

}
