package com.itheima1.practice.day7.collection1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        //1.添加元素，添加成功返回true
        c.add("java1");
        c.add("java1");
        c.add("java2");
        //清空集合元素
      //  c.clear();
        //判断集合是否为空，空返回true，反之
        c.isEmpty();
        //获取集合的大小
        c.size();
        //判断集合中是否包含某个元素。
        c.contains("java");
        //删除某个元素：多个重复删除第一个
      //  c.remove("java1");
//        c.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.equals("java1");
//            }
//        });
        c.removeIf((String s)-> s.equals("java1") );
        System.out.println(c);

        //把集合转换为数组
        Object[] arr = c.toArray();
        System.out.println(Arrays.toString(arr));

      //  String[] arr1 = c.toArray(String[]::new) JDK 11 支持
        //把一个集合的全部数据倒入到另一个集合中去
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c1.add("java3");
        c1.add("java4");
        c1.addAll(c2);
        System.out.println(c1);
    }

}
