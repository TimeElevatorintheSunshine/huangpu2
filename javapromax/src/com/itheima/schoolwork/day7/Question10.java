package com.itheima.schoolwork.day7;

import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Goods, Integer> goods = new HashMap<>();
        while (true){
            System.out.println("请输入店铺名称，end退出");
            String store = sc.next();
            if (store.equals("end"))break;
            System.out.println("请输入商品名称");
            String name = sc.next();
            Goods goods1 = new Goods(store,name);
            if (goods.containsKey(goods1)){
            goods.put(goods1,goods.get(goods1) +1);
            }else {
                goods.put(goods1,1);
            }
        }
        Set<Goods> set = goods.keySet();
        for (Goods s : set) {
            System.out.println(s.getStore() + s.getName() + goods.get(s));
        }
    }
}
class Goods{
    private String store;
    private String name;

    @Override
    public String toString() {
        return "Goods{" +
                "store='" + store + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Goods() {
    }

    public Goods(String store, String name) {
        this.store = store;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(store, goods.store) && Objects.equals(name, goods.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(store, name);
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}