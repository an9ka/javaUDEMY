package com.udemy;

public class lesson2 {
    public static void main(String [] args) {
        byte b1 = 1;  // 8 ибт от -128 до 127
        byte b2 = -15;

        short s1 = 234; // 16 бит  -32768 до 32767
        int i1 = 500;// 32 бита большой диапозон  дефолтный тип данных в java среди целочисленных
        long l1 = 10000000000L; //64 бита

        float f1 = 4.5F; // 32 бита (F обязателен)
        float f2 = 20;
        float f3 = 20.0F;

        double d1 = 64; //64 бита  дефолтный тип дробных данных в JAVA (D в конце не нужно)
        double d2 = 4.5;

        char c1 = 't'; // 16 бит   Символ, всегда в одинарных ковычках
        char c2 = 'Y';
        char c3 = '4';
        char c4 = 456;
        System.out.println(c4);

        boolean boo1 = true; // размер строго не определен

    }
}
