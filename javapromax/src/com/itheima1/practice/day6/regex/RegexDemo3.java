package com.itheima1.practice.day6.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        String data = " 来黑马程序员学习Java，\n" +
                "电话:1866668888，18699997777\n" +
                "或者联系邮箱：boniu@itcast.cn，\n" +
                "座机电话：01036517895，010-98951256\n" +
                "邮箱：bozai@itcast.cn，\n" +
                "邮箱：dlei0009@163.com，\n" +
                "热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";
        Pattern p = Pattern.compile("(1[3-9]\\d{9})|(0[1-9]\\d{1,5}-?[1-9]\\d{5,15})|(\\w{2,}@\\w{2,20}(\\.\\w{2,20}){1,2})|" +
                "(400-?\\d{3,9}-?\\d{3,9})");
        Matcher m = p.matcher(data);
        while (m.find()){
            String group = m.group();
            System.out.println(group);


        }

    }
}
