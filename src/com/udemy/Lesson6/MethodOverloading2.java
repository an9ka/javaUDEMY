package com.udemy.Lesson6;

public class MethodOverloading2 {
     public int sum(int i1, int i2){
          return i1 + i2;
     }

     String sum(String s1, String s2){
          return s1 + s2;
     }

     protected void sum(int a, String b){
          System.out.println("Jnfjfj");
     }
}

class MethodOverloading2Test{
     public static void main(String[] args){
          MethodOverloading2 mO2= new MethodOverloading2();

          int a = mO2.sum(5, 7);
          System.out.println(a);
          String s = mO2.sum("Hello, ", " friend");
          System.out.println(s);
     }
}