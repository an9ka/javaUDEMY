package com.udemy.lesson4Package;

public class Car {
    Car(String cvet, String motor){  //Создание конструктора с параметрами
    color = cvet;
    engine = motor;
    }

    String color;
    String engine;
    String name = "Anna";
   // String name = new String("Tetst");
}

class CarTest {
    public static void main(String[] args){
        Car car1 = new Car("red", "v5");
        System.out.println(car1.color + " " + car1.engine);
    }
}
