package com.itheima.exam.exam10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 目前有100名囚犯，每个囚犯的编号是1-200之间的随机数。现在要求依次随机生成100名囚犯的编号（要求这些囚犯的编号是不能重复的），
 * 然后让他们依次站成一排。(注：位置是从1开始计数的)，接下来，国王命令手下先干掉全部奇数位置处的人。剩下的人，又从新按位置1开始，
 * 再次干掉全部奇数位置处的人，依此类推，直到最后剩下一个人为止，剩下的这个人为幸存者。
 */
public class Topic1 {
    private static List<Prisoner> prisoners = new ArrayList<>();
    public static void main(String[] args) {

        Random r = new Random();
        for (int i = 1; i <= 100; i++) {
            while (true){
                int data = r.nextInt(200)+1;
                if (checkid(data)){
                    prisoners.add(new Prisoner(i,data));
                    break;
                }
            }
        }
        System.out.println(prisoners);



        while (prisoners.size() > 1) {
            List<Prisoner> prisoners1 = new ArrayList<>();
            for (int i = 1; i < prisoners.size(); i+=2) {
                Prisoner p = prisoners.get(i);
                prisoners1.add(p);
            }

            prisoners = prisoners1;
        }
        Prisoner survivor = prisoners.get(0);
        System.out.println(survivor);

    }
    public static boolean checkid(int data){
        for (int i = 0; i < prisoners.size(); i++) {
            if (prisoners.get(i).getId() == data){
                return false;
            }
        }
        return true;
    }
}
class Prisoner{
    private int number;
    private int id;

    @Override
    public String toString() {
        return "Prisoner{" +
                "number=" + number +
                ", id=" + id +
                '}';
    }

    public Prisoner() {
    }

    public Prisoner(int number, int id) {
        this.number = number;
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}