package com.udemy.Lesson6;

public class HomeWork5OverloadedMethods {
    int sum(){
        int result = 0;
        System.out.println("Сумма(нет параметров): " + result);
        return result;
    }
    int sum(int a){
        int result = a;
        System.out.println("Сумма(1 параметр): " + result);
        return result;
    }
    int sum(int a, int b){
        int result = a + b;
        System.out.println("Сумма(2 параметрa): " + result);
        return result;
    }
    int sum(int a, int b, int c){
        int result = a + b + c;
        System.out.println("Сумма(3 параметрa): " + result);
        return result;
    }
    int sum(int a, int b, int c, int d){
        int result = a + b + c + d;
        System.out.println("Сумма(4 параметрa): " + result);
        return result;
    }
}

class Test{
    public static void main(String[] args){
        HomeWork5OverloadedMethods over = new HomeWork5OverloadedMethods();
        over.sum();
        over.sum(4);
        over.sum(3,5);
        over.sum(123,90,1);
        over.sum(32,545,4,5);
    }
}