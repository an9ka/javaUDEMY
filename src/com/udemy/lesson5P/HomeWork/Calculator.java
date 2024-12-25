package com.udemy.lesson5P.HomeWork;

public class Calculator {
    int numberOne;
    int numberTwo;

    public Calculator(int numberOne, int numberTwo){
        this.numberTwo = numberTwo;
        this.numberOne = numberOne;
    }

    int add(){
        int result = numberOne + numberTwo;
        System.out.println("Сумма двух чисел: " + numberOne + " и " + numberTwo + " = " + result);
        return result;
    }
}

class CalculatorTest{
    public static void main(String[] args){
        Calculator calc = new Calculator(2,5);
        calc.add();
    }
}