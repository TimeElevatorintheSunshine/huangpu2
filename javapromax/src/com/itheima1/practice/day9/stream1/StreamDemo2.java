package com.itheima1.practice.day9.stream1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        // 目标：Stream流的常见终结方法。
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("摔跤吧，爸爸", 9.5, "阿米尔汗"));
        movies.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies.add(new Movie("阿甘正传", 7.5, "汤姆汉克斯"));

        // 1、forEach
        movies.stream().sorted((o1,o2)->Double.compare(o2.getScore(),o1.getScore())).forEach(System.out::println);
        // 2、count
        long count = movies.stream().distinct().count();
        System.out.println(count);

        // 3、取最大值
        Optional<Movie> max = movies.stream().max((o1, o2) -> Double.compare(o1.getScore(), o2.getScore()));
        Movie movie = max.get();
        System.out.println(movie);
        Optional<Movie> min = movies.stream().min((o1, o2) -> Double.compare(o1.getScore(), o2.getScore()));
        Movie movie1 = min.get();
        System.out.println(movie1);

        // 4、收集Stream流：把流中的数据恢复到集合或者数组中去。
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

        // 收集到List集合
        Stream<String> zStream = list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3);
        List<String> list2 = zStream.collect(Collectors.toList());
        System.out.println(list2);

        // 收集到Set集合(流只能用一次)
        Stream<String> zStream2 = list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3);
        Set<String> set = zStream2.collect(Collectors.toSet());
        System.out.println(set);

        // 收集到数组。
        Stream<String> zStream3 = list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3);
        // Object[] array = zStream3.toArray();
        String[] array = zStream3.toArray(String[]::new);
        System.out.println(Arrays.toString(array));

        // 拓展
        // 收到到Map集合。
        List<Movie> movies1 = new ArrayList<>();
        movies1.add(new Movie("摔跤吧，爸爸", 9.5, "阿米尔汗"));
        movies1.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies1.add(new Movie("三傻宝莱坞", 18.5, "阿米尔汗2"));
        movies1.add(new Movie("阿甘正传", 7.5, "汤姆汉克斯"));

        Map<String, Double> map = movies1.stream().sorted((o1, o2) -> Double.compare(o2.getScore(), o1.getScore()))
                .limit(3).collect(Collectors.toMap(Movie::getName, m -> m.getScore(), (aDouble, aDouble2) -> aDouble));
        System.out.println(map);
    }
}
