package com.udemy.lesson5P.HomeWork;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee (int id2, String surname2, int age2, double salary2, String department2){
        id = id2;
        surname =  surname2;
        age =  age2;
        salary =  salary2;
        department = department2;
    }
    double uvelichenieZp(){
        salary *= 2;
        return salary;
        }
}

class EmployeeTest{
    public static void main(String[] args){
        Employee emp1 = new Employee(1, "Ivanov", 32, 2500, "it");
        Employee emp2 = new Employee(2, "Sidorov", 26, 4300, "sale");

        emp1.uvelichenieZp();
        emp2.uvelichenieZp();
        System.out.println("Novaya zp rabotnika " + emp1.surname + ": " + emp1.salary);
        System.out.println("Novaya zp rabotnika " + emp2.surname + ": " + emp2.salary);


    }
}
