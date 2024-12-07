package com.udemy.lesson5P;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz(int i){
        speed+=i;
        return speed;
    }

    int tormoz(int i){
        speed-=i;
        return speed;
    }

    void showInfo(){  //void - метод ничего ен возвращает. Потому что нет return type.
        System.out.println("Color " + color + " engine:" + engine + " Speed: " + speed + "км/ч");

    }
}

class Car2Test{
    public static void main(String[] args){
        Car2 carOne = new Car2();
        carOne.color = "red";
        carOne.engine = "v6";
        carOne.speed = 90;
        carOne.showInfo();
        carOne.gaz(20);
        carOne.showInfo();
        carOne.tormoz(60);
        carOne.showInfo();
    }
}
