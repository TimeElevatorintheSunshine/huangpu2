package com.itheima.day1.test2;

import java.util.Scanner;

/**
 * 需求：
 * 给你一个字符串 `s`，找到 `s` 中最长的回文子串。
 * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
 */
public class Test6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "ababababab";
       /*int lengh = 0;
        String str3 =null;
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length(); j > i; j--) {
                String str1 =  str.substring(i,j);
                if (check(str1)){
                    if (str1.length() > lengh){
                        lengh = str1.length();
                        str3 = str1;
                    }
                }
            }
        }
        System.out.println(str3);*/
        System.out.println(longestPalindrome(str));
    }
    public static  boolean check (String s){
        for (int i = 0, j = s.length() -1; j > i; i++,j--) {
            if (!(s.charAt(i) == s.charAt(j))){
                return false;
            }
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int strLen = s.length();
        int maxStart = 0;  //最长回文串的起点
        int maxEnd = 0;    //最长回文串的终点
        int maxLen = 1;  //最长回文串的长度

        boolean[][] dp = new boolean[strLen][strLen];

        for (int r = 1; r < strLen; r++) {
            for (int l = 0; l < r; l++) {
                if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > maxLen) {
                        maxLen = r - l + 1;
                        maxStart = l;
                        maxEnd = r;

                    }
                }

            }

        }
        return s.substring(maxStart, maxEnd + 1);

    }
}
