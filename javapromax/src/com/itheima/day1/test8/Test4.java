package com.itheima.day1.test8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {
    public static void main(String[] args) {
        String data = " 来黑马程序员学习Java，\n" +
                "        电话：1866668888，18699997777\n" +
                "        或者联系邮箱：boniu@itcast.cn，\n" +
                "        座机电话：01036517895，010-98951256\n" +
                "        邮箱：bozai@itcast.cn，\n" +
                "        邮箱：dlei0009@163.com，\n" +
                "        热线电话：400-618-9090 ，heima, 400-618-4000，4006184000，4006189090";
        // 1、定义爬取规则
        String regex = "(\\w{2,9})@(\\w{2,9})(\\.\\w{2,9}){1,2}";
        // 2、把正则表达式封装成一个Pattern对象
        Pattern pattern = Pattern.compile(regex);
        // 3、通过pattern对象去获取查找内容的匹配器对象。
        Matcher matcher = pattern.matcher(data);
        // 4、定义一个循环开始爬取信息
      while (matcher.find()){
          System.out.println(matcher.group());
          System.out.println(matcher.group(1) );// 指定获取正则表达式匹配后的第一组内容
          System.out.println(matcher.group(2)); // 指定获取正则表达式匹配后的第二组内容
      }

    }
}
