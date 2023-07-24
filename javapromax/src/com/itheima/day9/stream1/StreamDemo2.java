package com.itheima.day9.stream1;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        // Stream 常见方法
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        list.stream().filter(s -> s.startsWith("张") && s.length() == 3).forEach(System.out::println);

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("摔跤吧，爸爸", 9.5, "阿米尔汗"));
        movies.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies.add(new Movie("阿甘正传", 7.5, "汤姆汉克斯"));
       // 实现接口，指定比较规则
        movies.stream().sorted().forEach(System.out::println);

        movies.stream().sorted((o1,o2)->Double.compare(o2.getScore(), o1.getScore())).forEach(System.out::println);

        // limit取前几个
        movies.stream().sorted((o1,o2)->Double.compare(o2.getScore(), o1.getScore())).limit(2).forEach(System.out::println);

        // 跳过前几个skip
        movies.stream().sorted((o1,o2)->Double.compare(o2.getScore(), o1.getScore())).skip(2).forEach(System.out::println);

        // distinct去重复 ,主要重写hashCode和equals
        movies.stream().sorted((o1,o2)->Double.compare(o2.getScore(), o1.getScore())).distinct().forEach(System.out::println);

        // map加工方法(映射)：把流上的数据加工成新数据。
        movies.stream().map(m->{
                m.setName("黑马" + m.getName());
                return m;
        }).forEach(System.out::println);
        // 合并流
        Stream<String> s1 = Stream.of("张三", "楚留香", "西门吹牛");
        Stream<String> s2 = Stream.of("李四", "石观音");

        Stream<String> allStream = Stream.concat(s1, s2);
        allStream.forEach(System.out::println);

        // forEach
        movies.stream().sorted().forEach(System.out::println);
        // count
        long count = movies.stream().filter(m -> m.getScore() >= 8).count();
        System.out.println(count);

        // max
        Optional<Movie> max = movies.stream().max((o1, o2) -> Double.compare(o1.getScore(), o2.getScore()));
        System.out.println(max);

        // 收集Stream流
        List<String> list2 = new ArrayList<>();
        list2.add("张无忌");
        list2.add("周芷若");
        list2.add("赵敏");
        list2.add("张强");
        list2.add("张三丰");
        list2.add("张三丰");
        list2.add("张三丰");
        Stream<String> zStream = list2.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3);
        // 收集到List集合
        List<String> list3 = zStream.collect(Collectors.toList());
        System.out.println(list3);

        // 收集到Set集合(流只能用一次)
        Stream<String> zStream1 = list2.stream().filter(s -> s.length() == 3).distinct();
        Set<String> collect = zStream1.collect(Collectors.toSet());
        System.out.println(collect);
        list.stream().map(s-> "黑马" + s).forEach(System.out::println);
        // 收集到数组
        Stream<String> zStream2 = list2.stream().filter(s -> s.length() == 3).distinct();
       // Object[] objects = zStream2.toArray();
        String[] strings = zStream2.toArray(String[]::new);
        System.out.println(Arrays.toString(strings));
        // 收集到Map集合

       // Map<String, Double> map = movies.stream().sorted((o1, o2) -> Double.compare(o2.getScore(), o1.getScore()))
   //             .limit(3).distinct().collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
   //     System.out.println(map);
        Map<Movie, Movie> collect1 = movies.stream().sorted((o1, o2) -> Double.compare(o2.getScore(), o1.getScore()))
                .limit(3).collect(Collectors.toMap(m -> new Movie(m.getName(), m.getScore()), m -> new Movie(m.getActor())));
        System.out.println(collect1);
    }
}

class Movie implements Comparable<Movie> {
    private String name;
    private double score;
    private String actor;

    public Movie() {
    }

    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    } public Movie(String name, double score) {
        this.name = name;
        this.score = score;

    } public Movie(String actor) {

        this.actor = actor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(movie.score, score) == 0 && Objects.equals(name, movie.name) && Objects.equals(actor, movie.actor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score, actor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return (name==null?"":name)  +
                ( score==0?"":score) +
                 (actor==null?"":actor)
               ;
    }

    @Override
    public int compareTo(Movie o) {
        return Double.compare(this.score, o.score); // 升序！
    }
}


