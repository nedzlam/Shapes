package com.company;

public class Rectangle extends Shape {

    public Rectangle (int x1, int x2, int y1, int y2, String boja, String naziv){
        super(x1, x2, y1, y2, boja, naziv);
    }
    public double calcArea(){
       return ((Math.sqrt((x2-x1)*(x2-x1))) * (Math.sqrt((y2-y1)*(y2-y1))));
}
    @Override public void show(){
        System.out.println("Površina pravouganika je: " +calcArea());
    }

}
