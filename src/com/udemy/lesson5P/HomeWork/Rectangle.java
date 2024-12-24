package com.udemy.lesson5P.HomeWork;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    int area(){
        int result = width * height;
        System.out.println("Площадь прямоугольнка: " + result);
        return result;
    }

    int perimeter(){
        int result = (width + height) * 2;
        System.out.println("Периметр прямоугольнка: " + result);
        return result;
    }
}

class testRectangle{
  public static void main(String[] args) {
      Rectangle r1 = new Rectangle(1,1);
      Rectangle r2 = new Rectangle(4,6);

      r2.area();
      r2.perimeter();
      r1.area();
      r1.perimeter();
  }
}
