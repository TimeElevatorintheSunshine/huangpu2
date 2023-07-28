package com.itheima.day1.test12.xml1;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test1 {
    public static void main(String[] args) throws Exception{
        SAXReader s = new SAXReader();
        Document r = s.read("src/com/itheima/day1/test12/xml1/orders.xml");
        Element root = r.getRootElement();
        System.out.println(root.getName());
        List<Element> elements = root.elements();
        List<Order> orders = new ArrayList<>();
        for (Element element : elements) {
            Order order = new Order();
            order.setName(element.elementText("name"));
            order.setTime(LocalDateTime.parse(element.elementText("time"), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            order.setPrice(Double.valueOf(element.elementText("double")));
            orders.add(order);
        }
       // System.out.println(orders);
        LocalDateTime now = LocalDateTime.now();
       // orders.stream().filter(order -> order.getTime().isAfter(now)).forEach(System.out::println);
        Optional<Order> max = orders.stream().max(Comparator.comparingDouble(Order::getPrice));

          orders.stream().filter(order -> BigDecimal.valueOf(order.getPrice()).compareTo(BigDecimal.valueOf(max.get().getPrice())) == 0).forEach(System.out::println);
      //  orders.stream().sorted((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice())).forEach(System.out::println);
    }
}
class Order{
    private String name;
    private LocalDateTime time;
    private Double price;

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(name, order.name) && Objects.equals(time, order.time) && Objects.equals(price, order.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, time, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}