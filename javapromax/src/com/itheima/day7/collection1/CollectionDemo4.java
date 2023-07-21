package com.itheima.day7.collection1;

import java.util.*;

public class CollectionDemo4 {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("肖申克的救赎","蒂姆",9.7));
        movies.add(new Movie("霸王别姬","张国荣",9.6));
        movies.add(new Movie("阿甘正传","汤姆",9.5));
        Iterator<Movie> iterator = movies.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Movie movie:movies) {
            System.out.println(movie);
        }
      movies.sort(new Comparator<Movie>() {
          @Override
          public int compare(Movie o1, Movie o2) {
              return o1.getScore().compareTo(o2.getScore());
          }
      });
        movies.forEach(System.out::println);
    }
}
class Movie {
    private String name;
    private String actor;
    private Double score;

    @Override
    public String toString() {
        return
                "《" + name + '》' +
                ", 主演:" + actor  +
                ", 评分" + score
                ;
    }

    public Movie() {
    }

    public Movie(String name, String actor, Double score) {
        this.name = name;
        this.actor = actor;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }


}