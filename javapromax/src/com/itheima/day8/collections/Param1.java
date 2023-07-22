package com.itheima.day8.collections;

import java.util.Arrays;

public class Param1 {
    public static void main(String[] args) {
        // 可变参数
        // 传参数非常的灵活和方便
        sum();
        sum(11);
        sum(11,22);
        sum(11,22,33);

    }
    // 注意事项
    // 可变参数在形参列表中只能有一个，并且必须放在形参最后面
    public static void sum(int...nums){
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
