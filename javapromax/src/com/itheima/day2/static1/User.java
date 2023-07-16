package com.itheima.day2.static1;

public class User {
    // 静态变量：只有一份，记录对象创建的个数
    public static int number;

    public User(){
        // 同一个类中范围静态变量，可以省略类名不写
      //   User.number++;
        number++;
    }
}
