package com.itheima.day1.test8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {
    public static void main(String[] args) {
        String data = "欢迎张全蛋光临本系统！他删库并跑路，欢迎李二狗子光临本系统！" +
                "欢迎马六子光临本系统！它浏览了很多好看的照片！欢迎夏洛光临本系统！他在六点钟购买了一台拖拉机！";

        String regex = "欢迎(.+?)光临";
        String regex1 = "欢迎?(.+?)光临";

        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(data);
        while (matcher.find()){
            System.out.println(matcher.group(1));

        }
    }
}
