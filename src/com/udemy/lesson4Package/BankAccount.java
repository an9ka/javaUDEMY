package com.udemy.lesson4Package;

public class BankAccount { //Любой класс является типом данных. Референс тип данных
    int id = 10;
    String name = "Fedor";
    double balance = 100;// переменные объекта, относятся, к каждому созданному объекту

    void popolnenieScheta(double summaPopolneniya){
    System.out.println("Balance do: " + balance);
    System.out.println("Balance popolnen na " + summaPopolneniya);
    balance+=summaPopolneniya;
    System.out.println("Balance posle: " + balance);
    }

    void snyatieScheta(double summaSnyatiya){
        System.out.println("Balance do: " + balance);
        System.out.println("Balance umenshen na " + summaSnyatiya);
        balance-=summaSnyatiya;
        System.out.println("Balance posle: " + balance);
    }
}

   class BankAccountTest {

       public static void main(String[] args) {
           BankAccount MyAccount = new BankAccount();
           MyAccount.popolnenieScheta(23.54);
           MyAccount.snyatieScheta(34.43);

       }
   }
 /*   public static void main(String[] args) {
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
    } */