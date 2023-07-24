package com.itheima.schoolwork.day8;

import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Question2 {
    public static void main(String[] args) {
        Map<String, Double> earth = new HashMap<>();
        earth.put("《肖生克的救赎》",9.7);
        earth.put("《霸王别姬》",9.6);
        earth.put("《阿甘正传》",9.6);
        earth.put("《辛德勒的名单》",9.6);
        earth.put("《美丽人生》",9.5);
        earth.put("《千与千寻》",9.4);
        earth.put("《泰坦尼克号》",9.4);
        earth.put("《这个杀手不太冷》",9.4);
        earth.put("《忠犬八公的故事》",9.4);
        earth.put("《盗梦空间》",9.3);
        Map<String, Double> china = new HashMap<>();
        china.put("《阳光普照》",8.5);
        china.put("《气球》",7.9);
        china.put("《拆弹专家2》",7.9);
        china.put("《一秒钟》",7.8);
        china.put("《送你一朵小红花》",7.5);
        china.put("《金都》",7.7);
        china.put("《叔叔》",7.7);
        china.put("《八佰》",7.6);
        china.put("《夺冠》",7.3);
        china.put("《我和我的家乡》",7.3);
        earth.keySet().stream().sorted((o1, o2) -> Double.compare(earth.get(o2),earth.get(o1))).limit(3).forEach(System.out::println);
        china.keySet().stream().sorted(Comparator.comparingDouble(china::get)).limit(5).forEach(System.out::println);
        Map<String, Double> all = new HashMap<>();
        earth.keySet().stream().sorted((o1, o2) -> Double.compare(earth.get(o2),earth.get(o1))).limit(5)
                .forEach(s -> all.put(s,earth.get(s)));
        china.keySet().stream().sorted((o1, o2) -> Double.compare(china.get(o2),china.get(o1))).limit(5)
                .forEach(s -> all.put(s,china.get(s)));
        ArrayList<Film> films = new ArrayList<>();
        Set<String> set = all.keySet();
        for (String s : set) {
            films.add(new Film(s,all.get(s)));
        }
        films.sort(Comparator.comparingDouble(Film::getScore));
        System.out.println(films);
    }
}
class Film{
    private String name;
    private Double score;

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Film() {
    }

    public Film(String name, Double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}