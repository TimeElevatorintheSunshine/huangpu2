package com.itheima.day1.test8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String data = " 来黑马程序员学习Java，\n" +
                "        电话：1866668888，18699997777\n" +
                "        或者联系邮箱：boniu@itcast.cn，\n" +
                "        座机电话：01036517895，010-98951256\n" +
                "        邮箱：bozai@itcast.cn，\n" +
                "        邮箱：dlei0009@163.com，\n" +
                "        热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";
        String regex = "(\\w{2,}@\\w{2,10}(\\.\\w{2,10}){1,2})|"+
                "(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})|(400-?\\d{3,9}-?\\d{3,8})";
       /* String regex1 = "(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})|(\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2})"
                + "|(400-?\\d{3,7}-?\\d{3,7})";*/
        Pattern compile = Pattern.compile(regex);

        Matcher matcher = compile.matcher(data);
        while (matcher.find()){
            String rs = matcher.group();
            System.out.println(rs);
        }
    }
}
