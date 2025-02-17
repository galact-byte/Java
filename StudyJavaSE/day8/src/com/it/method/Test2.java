package com.it.method;

public class Test2 {
    public static void main(String[] args) {
//        CarFactory factory = new CarFactory() {
//            @Override
//            public Car getName(String name) {
//                return new Car(name);
//            }
//        };
//        CarFactory factory = (name)->new Car(name);
        CarFactory factory = Car::new;
        Car car = factory.getName("奔驰");
        System.out.println(car);
    }
}
interface CarFactory{
    Car getName(String name);
}

class Car{
    private String name;

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
    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + '}';
    }
}