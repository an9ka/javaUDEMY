package com.udemy.lesson4Package;

public class student {
    int numberStudentTicket;
    String FirstName;
    String LastName;
    int YearsLern;
    double gradeMath;
    double gradeEconom;
    double foreignLanguage;


}

class StudentTest{
    double srednyaArifm(student st) {
        double sredOcenka = (st.gradeEconom + st.gradeMath + st.foreignLanguage) / 3;
        System.out.println("Srednya ocenka " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args){
        student student1 = new student();
        student student2 = new student();
        student student3 = new student();

        student1.gradeMath = 3.4;
        student1.gradeEconom = 4.2;
        student1.foreignLanguage = 3.5;

        student2.gradeMath = 4.9;
        student2.gradeEconom = 3.2;
        student2.foreignLanguage = 4.7;

        student3.gradeMath = 4.4;
        student3.gradeEconom = 4.7;
        student3.foreignLanguage = 4.9;

        StudentTest sTest = new StudentTest();
        sTest.srednyaArifm(student1);
        sTest.srednyaArifm(student2);
        sTest.srednyaArifm(student3);


    }
}