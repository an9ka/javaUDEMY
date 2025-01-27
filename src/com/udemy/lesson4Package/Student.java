package com.udemy.lesson4Package;

public class Student {
    int id;
    String name;
    String surname;
    int course;
    double gradeMath;
    double gradeEconom;
    double foreignLanguage;

    Student(int id, String name, String surname, int course, double gradeMath, double gradeEconom, double foreignLanguage) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.gradeMath = gradeMath;
        this.gradeEconom = gradeEconom;
        this.foreignLanguage = foreignLanguage;
    }
    Student(int id, String name, String surname, int course) {
        this(id, name, surname, course, 0.0, 0.0, 0.0);
    }
    Student(){
        this(0, "", "", 0);
        System.out.println("Конструктор без значений");
    }
}

class StudentTest{
    double srednyaArifm(Student st) {
        double sredOcenka = (st.gradeEconom + st.gradeMath + st.foreignLanguage) / 3;
        System.out.println("Средняя оценка студента " + st.name + ": " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args){
        Student student1 = new Student(1, "Ivan", "Ivanov", 4, 4.2, 3.1,5.0);
        Student student2 = new Student(2, "Serg", "Redov", 2);
        Student student3 = new Student();

        StudentTest sTest = new StudentTest();
        sTest.srednyaArifm(student1);
        sTest.srednyaArifm(student2);
        sTest.srednyaArifm(student3);
    }
}