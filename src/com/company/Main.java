package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite prvu koordinatu po x osi x1: ");
        x1 = unos.nextInt();
        System.out.println("Unesite drugu koordinatu po x osi x2: ");
        x2 = unos.nextInt();
        System.out.println("Unesite prvu koordinatu po y osi y1: ");
        y1 = unos.nextInt();
        System.out.println("Unesite drugu koordinatu po y osi y2: ");
        y2 = unos.nextInt();
        com.company.Rectangle rectangle = new com.company.Rectangle(x1, x2, y1, y2, "plava", "pravouganik");
        com.company.Square square = new com.company.Square(x1, x2, y1, y2, "crna", "kvadrat");
        com.company.Circle circle = new com.company.Circle(x1, x2, y1, y2, "crvena", "krug");
        if (Math.abs((x2-x1)) == Math.abs((y2-y1))) {
        square.show();
    }
        else rectangle.show();
        circle.show();
}
}
