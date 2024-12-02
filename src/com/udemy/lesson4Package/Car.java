package com.udemy.lesson4Package;

public class Car {
    String color = "red";
    String engine = "v6";
    String name = "Anna";
   // String name = new String("Tetst");
}

class CarTest {
    public static void main(String[] args){
        int a;
        Car car1 = new Car();
        car1.color = "black";
        car1.engine = "v8";

        System.out.println("Color: " + car1.color);
        System.out.println("Engine: " + car1.engine);
        System.out.println(new Car().color);
    }
}
