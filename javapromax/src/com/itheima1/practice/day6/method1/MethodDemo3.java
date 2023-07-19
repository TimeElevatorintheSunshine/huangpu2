package com.itheima1.practice.day6.method1;

public class MethodDemo3 {
    public static void main(String[] args) {
    /*  Create create =  new Create() {
            @Override
            public Car create(String name) {
                return new Car(name);
            }
        };*/
        Create create = Car::new;
        Car car = create.create("别摸我");
        System.out.println(car.getName());
    }
}

interface Create{
    Car create(String name);
}

class Car{
    private String name;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}