package com.itheima.schoolwork.day5;


import java.util.Random;
import java.util.function.Function;

/**
 * 在素材的function项目中指定的位置补全代码，
 * 实现从userNames数组中随机获取一个元素返回(点名器)! 案例的执行效果如下所示：
 */
public class Question3 {
    public static void main(String[] args) {

        // 定义一个存储学生姓名的数组
        String[] userNames = {"郭靖", "黄药师" , "黄蓉" , "欧阳锋" , "老顽童" , "瑛姑"} ;

        // 在等号右边补全代码实现getUserName方法调用
        String userName = getUserName((String[] strings)-> {
                Random r =new Random();
                String userName1 = userNames[r.nextInt(userNames.length)];
                return userName1;
            }
        , userNames);

        // 输出
        System.out.println("请" + userName + "同学回答问题！");

    }

    // 从数组中随机获取一个元素
    public static String getUserName(Function<String[] , String> function , String[] userNames) {
        return function.apply(userNames) ;
    }
}

