package com.udemy.lesson5P;
//005 Урок 5 Создание объектов. Понятие «конструктор». Объявление и вызов методов
public class lesson5 {
    int sum(int a, int b, int c){  //параметры
        int result = a + b +c;
        String s = "hello";
        return result;
    }
    //Вызов метода внутри метода
    int sredneeArifm(int a1, int b1, int c1){
        int result2 = sum(a1, b1, c1)/3;
        return result2;
    }

}

class testLesson5{
    public static void main(String[] args){ 
        lesson5 t = new lesson5();
        t.sum(1,2,3);
        int sum3 = t.sum(1,2,3);
        System.out.println(sum3);
        System.out.println(t.sum(3,5,2)); // аргументы функции
        System.out.println(t.sredneeArifm(20,40,60));
    }
}