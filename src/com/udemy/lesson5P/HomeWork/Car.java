package com.udemy.lesson5P.HomeWork;

public class Car {
    String brand;
    int year;
    int mileage;

    void info(){
        System.out.println("Марка: " + brand + ", Год выпуска: " + year + ", Пробег: " + mileage + "км");
    }

    void drive(int distance){
        if (distance < 0) {
            System.out.println("Ошибка: расстояние не может быть отрицательным.");
            return;
        }
        mileage+=distance;
        System.out.println("Автомобиль проехал " + distance + " км. Текущий пробег: " + mileage + " км.");
    }
}

class testCar {
public static void main(String[] args){
    Car car1 = new Car();
    car1.mileage = 23999;
    car1.brand = "BMW";
    car1.year = 2012;
    car1.drive(20);
    car1.info();

}
}
