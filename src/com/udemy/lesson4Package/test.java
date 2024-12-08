package com.udemy.lesson4Package;

public class test {
    test(){  // Конструктор без параметров
      System.out.println("Object is created");
    }

    String color;
    String engine;
}

class test2 {
    public static void main(String[] args){
        test car1 = new test();
        System.out.println(car1.color + " " + car1.engine);
    }
}
