package oop;

import java.util.Scanner;
import entities.Triagle;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enther the measures of triangule x ");

        Triagle x,y;
        x = new Triagle();
        y = new Triagle();

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enther the measures of triangule Y ");

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();
        double areaMaior = y.areaMaior(areaX,areaY);

        System.out.println("Triangle x Area: "+ areaX);
        System.out.println("Triangle Y Area: "+ areaY);
        System.out.println("Larger Area: "+ areaMaior);


    }
}
