package com.itheima.day1.test2;

public class Solution {
    public static void main(String[] args) {
        String str = "ababababab";
        check(str);
    }

    public static void check(String str) {
        int length = 0;
        String str3 = null;

        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length(); j >= i; j--) {
                boolean flag = true;
                String str1 = str.substring(i, j);
                for (int a = 0, b = str1.length() - 1; b >= a; a++, b--) {
                    if (str1.charAt(a) != str1.charAt(b)) {
                       flag =false;
                    }
                }
                if (flag) {
                    if (str1.length() >= length) {
                        length = str1.length();
                        str3 = str1;
                        System.out.print(str3+"\t");
                    }
                }
            }

        }

    }
}