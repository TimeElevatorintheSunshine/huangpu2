package com.itheima.day5;

import java.time.Instant;
import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        System.out.println(getArrayData(new int[]{11, 22, 33}));
    }
    public static String getArrayData(int[] arr){
        // 1、判断arr是否为null
        if(arr == null){
            return null;
        }

        // 2、arr数组对象存在。 arr = [11, 22, 33]
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        //   StringBuilder sb = new StringBuilder();
       // sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            stringJoiner.add(arr[i] + "");
           /* if(i == arr.length - 1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }*/
           // sb.append(arr[i]).append(i == arr.length-1?"" : ",");
        }
      //  sb.append("]");
        return stringJoiner.toString();
    }
}
