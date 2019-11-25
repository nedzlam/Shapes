package com.company;

public class Circle extends Shape {

    public Circle(int x1, int x2, int y1, int y2, String boja, String naziv){
        super(x1, x2, y1, y2, boja, naziv);
    }
    public double calcArea(){
      double r;
      r = (Math.sqrt((((x2-x1)*(x2-x1))) + (((y2-y1)*(y2-y1))))) / 2;
        return r*r*Math.PI;
    }
    @Override public void show(){
        System.out.println("Površina kruga je: " +calcArea());
    }
}
