package com.itheima.schoolwork.day6;

import java.util.*;

/**
 * "斗地主"游戏是大家都比较喜欢的游戏。游戏规则：本游戏为三人游戏，一副牌54张，每人17张，留3张做底牌，
 * 在确定地主之前玩家不能看底牌。确定地主后，地主可获得3张底牌。
 */
public class Question2 {
    public static void main(String[] args) {
        // 牌盒
        List<String> card = new ArrayList<>();
        String[] s = {"♥", "♦", "♣", "♠"};
        String[] s1 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < s.length; i++) {
            for (int i1 = 0; i1 < s1.length; i1++) {
                card.add(s[i] + s1[i1]);
            }
        }
        card.add("🤡");
        card.add("🃏");
        //   System.out.println(card);
        // 打乱
        Collections.shuffle(card);
        System.out.println(card);
        // 1、创建四个List集合对象，分别用来存储3个玩家的牌以及底牌
        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> landlord = new ArrayList<>();
        // 2、遍历牌盒将合适的牌存储到上述指定的集合中
        int n = card.size() / 3;
        for (int i = 0; i < n - 1; i++) {
            player1.add(card.remove(card.size() - 1));
            player2.add(card.remove(card.size() - 1));
            player3.add(card.remove(card.size() - 1));
        }
        landlord.addAll(card);
        // 3、看牌就是对集合的元素进行遍历
        System.out.println("发牌~~~~~~~~~~~~~~~~~");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(landlord);

        LinkedList<String> players1 = new LinkedList<>();
        LinkedList<String> players2 = new LinkedList<>();
        LinkedList<String> players3 = new LinkedList<>();
        // 4、【选做】对每人手上的牌进行排序，从小到大的方式.[3,4,5,6,7,8,9,10,J,Q,K,A,2,王]
        String[] value = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "🃏", "🤡"};
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < player1.size(); j++) {
                String a = value[i];
                String a1 = player1.get(j);
                String a2 = player2.get(j);
                String a3 = player3.get(j);
                if (a1.contains(a)) {
                    players1.addLast(a1);
                }
                if (a2.contains(a)) {
                    players2.addLast(a2);
                }
                if (a3.contains(a)) {
                    players3.addLast(a3);
                }
            }
        }
        System.out.println("排序~~~~~~~~~~~~~~~~~~");
        System.out.println(players1);
        System.out.println(players2);
        System.out.println(players3);
        System.out.println(landlord);
    }
}
