package com.itheima1.practice.day9.stream1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        // 目标：掌握Stream流的常见方法。
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若","赵敏","张强","张三丰");
        // 1、过滤方法
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(System.out::println);


        // 2、准备一个集合，排序。
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("摔跤吧，爸爸", 9.5, "阿米尔汗"));
        movies.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies.add(new Movie("阿甘正传", 7.5, "汤姆汉克斯"));

        // 集合中如果存储对象，
        // 方式一：对象类可以实现Comparable接口，指定比较规则  // sorted方法就可以按照规则进行排序，否则报错！
       movies.stream().sorted().forEach(System.out::println);

       movies.stream().sorted((o1,o2)->Double.compare(o2.getScore(),o1.getScore())).forEach(System.out::println);

        // 3、limit取前几个
        System.out.println("-----------------------------------------------");
       movies.stream().sorted((o1,o2)->Double.compare(o2.getScore(),o1.getScore())).limit(2).forEach(System.out::println);
        // 4、跳过前几个skip
        System.out.println("-----------------------------------------------");
       movies.stream().sorted((o1,o2)->Double.compare(o2.getScore(),o1.getScore())).skip(2).forEach(System.out::println);
        // 5、distinct去重复
        System.out.println("-----------------------------------------------");
        // 去重复：需要重写对象类的hashCode和equals方法
        movies.stream().sorted().distinct().forEach(System.out::println);

        // 6、map加工方法(映射)：把流上的数据加工成新数据。
        System.out.println("-----------------------------------------------");
        movies.stream().map((Movie m) ->{
                m.setName("黑马:" + m.getName());
                return m;
        }).forEach(System.out::println);


        list.stream().map(s -> "黑马" +s).forEach(System.out::println);

        // 7、合并流。
        // 把两个流接起来 。
        Stream<String> s1 = Stream.of("张三", "楚留香", "西门吹牛");
        Stream<String> s2 = Stream.of("李四", "石观音");
        // public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
        Stream<String> allStream = Stream.concat(s1, s2);
        System.out.println(allStream.count()); // 获取个数

    }
}
