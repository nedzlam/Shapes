package com.company;

public class Shape{
    public int x1, x2;
    public int y1, y2;
    public String boja;
    public String naziv;
    public Shape(int x1, int x2, int y1, int y2, String boja, String naziv){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.boja = boja;
        this.naziv = naziv;
    }
    public void show(){
        System.out.println("Površina iznosi: ");
    }

}

