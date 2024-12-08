package com.udemy.lesson5P;

public class Human {
    String name;
    Car3 car;    //Переменные референс типа данных
    BankAccount bA;

    void info(){
        System.out.println("Name: " + name + ", Color auto: " + car.color + ", Balance: " + bA.balance);
    }
}

class HumanTest{
    public static void main(String[] args){
        Human h = new Human();
        h.name = "Jon";
        h.car = new Car3("white", "v8");
        h.bA = new BankAccount(27, 500.50);
        h.info();
    }
}

class Car3{
    Car3(String c, String e){
        color = c;
        engine =e;
    }
    String color;
    String engine;
}
class BankAccount{
    BankAccount(int id2, double balance2){
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}