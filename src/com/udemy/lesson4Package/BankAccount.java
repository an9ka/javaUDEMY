package com.udemy.lesson4Package;

public class BankAccount { //Любой класс является типом данных. Референс тип данных
    int id;
    String name;
    double balance;}
    // переменные объекта, относятся, к каждому созданному объекту

   class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount(); //MyAccount - имя переменной, BankAccount() - вызов конструктора, создание объекта
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();
        //MyAccount содержит адрес до объекта BankAccount

        MyAccount.id = 1;
        MyAccount.name = "Anna";
        MyAccount.balance = 16.50;

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 780.50;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 12.40;



        System.out.println(YourAccount.name);
    }

   }