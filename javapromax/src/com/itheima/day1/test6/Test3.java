package com.itheima.day1.test6;

public class Test3 {
    public static void main(String[] args) {
      /* CreateCar c =  new CreateCar() {
            @Override
            public Car create(String name, double price) {
                return new Car(name,price);
            }
        };*/
        CreateCar c =  Car::new;
       Car c1 = c.create("特斯拉",99999);
        System.out.println(c1);
    }
}
interface CreateCar{
    Car create(String name,double price);
}
class Car{
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Car() {
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}