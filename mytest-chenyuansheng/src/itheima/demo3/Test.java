package itheima.demo3;

import java.util.ArrayList;

public class Test {
    private static ArrayList<Drink> drinks = new ArrayList<>();
    private static Integer sum = 0;
    private static String name;

    public static void main(String[] args) {

        drinks.add(new Drink("水", 24, 4));
        drinks.add(new Drink("牛奶", 160, 8));
        drinks.add(new Drink("五粮液", 4000, 2));
        drinks.add(new Drink("可乐", 108, 6));
        drinks.add(new Drink("茅台", 4000, 1));
        System.out.println("总价值" + f(10));
    }
    public static Integer f(int a) {
        Integer max = 0;
        int n = 0;
        if (a == 0) {
            return 0;
        }
        for (int i = 0; i < drinks.size(); i++) {
            int unitPrice = drinks.get(i).getPrice() / drinks.get(i).getSheng();
            if (unitPrice > max) {
                max = unitPrice;
                n = i;
            }

        }
        Integer sheng = drinks.get(n).getSheng();
        if (sheng >= a) {
            sheng = a;
            sum += sheng * max ;
            name = drinks.get(n).getName();
            System.out.println(name + "取了" + sheng + "升");
        } else {
            sum += max*sheng;
            name = drinks.get(n).getName();
            System.out.println(name + "取了" + drinks.get(n).getSheng() + "升");
            drinks.get(n).setPrice(0);
        }
        f(a - sheng);
        return sum;
    }
}

class Drink {
    private String name;
    private Integer price;
    private Integer sheng;

    @Override
    public String toString() {
        return "drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sheng=" + sheng +
                '}';
    }

    public Drink() {
    }

    public Drink(String name, Integer price, Integer sheng) {
        this.name = name;
        this.price = price;
        this.sheng = sheng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSheng() {
        return sheng;
    }

    public void setSheng(Integer sheng) {
        this.sheng = sheng;
    }
}