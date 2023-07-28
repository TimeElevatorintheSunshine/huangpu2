package com.itheima.exam1.demo7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Get {


    public static void main(String[] args) {
        Liquid l = new Liquid("水", 4, 24);
        Liquid l1 = new Liquid("牛奶", 8, 160);
        Liquid l2 = new Liquid("五粮液", 2, 4000);
        Liquid l3 = new Liquid("可乐", 6, 108);
        Liquid l4 = new Liquid("茅台", 1, 4000);
        // 创建集合存储液体对象
        List<Liquid> liquids = new ArrayList<>();
        Collections.addAll(liquids,l,l1,l2,l3,l4);
        // 遍历集合,按照单价排序
        liquids.sort((o1, o2) -> Double.compare(o2.unitPrice(),o1.unitPrice()));
        int weight = 10;
        Double money = 0.0;
        for (Liquid liquid : liquids) {
            if (weight == 0)break;
            if (liquid.getWight() >= weight){
                money +=liquid.unitPrice() * weight;
                System.out.println(liquid.getName() + "取走了" + weight + "升");
                break;
            }else {
                money += liquid.unitPrice() *liquid.getWight();
                weight = weight - liquid.getWight();
                System.out.println(liquid.getName() + "取走了" + liquid.getWight() + "升");
            }
        }
        System.out.println("最高价值为:" + money);
    }
}
class Liquid {
    private String name;
    private Integer wight;
    private Integer price;

    @Override
    public String toString() {
        return "Liquid{" +
                "name='" + name + '\'' +
                ", wight=" + wight +
                ", price=" + price +
                '}';
    }

    public Double unitPrice(){
        BigDecimal bigDecimal = BigDecimal.valueOf(price);
        BigDecimal bigDecimal1 = BigDecimal.valueOf(wight);
        return bigDecimal.divide(bigDecimal1,2, RoundingMode.HALF_UP).doubleValue();
    }
    public Liquid() {
    }

    public Liquid(String name, Integer wight, Integer price) {
        this.name = name;
        this.wight = wight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWight() {
        return wight;
    }

    public void setWight(Integer wight) {
        this.wight = wight;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}