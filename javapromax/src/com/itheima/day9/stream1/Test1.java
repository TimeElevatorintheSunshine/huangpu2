package com.itheima.day9.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Movie> movies1 = new ArrayList<>();
        movies1.add(new Movie("摔跤吧，爸爸", 9.5, "阿米尔汗"));
        movies1.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies1.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies1.add(new Movie("阿甘正传", 7.5, "汤姆汉克斯"));
        Map<Movie, Movie> collect1 = movies1.stream().sorted((o1, o2) -> Double.compare(o2.getScore(), o1.getScore()))
                .limit(3).collect(Collectors.toMap(m -> new Movie(m.getName(), m.getScore()), m -> new Movie(m.getActor()),(aDouble,Double)->Double));
        System.out.println(collect1);

    }
}
