package com.company;
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class ProgramWithPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input= new Scanner(System.in);
        Triangle x,y;
        x=new Triangle();
        y= new Triangle();

        System.out.println("Enter the measure of triangle X:");
        x.a=input.nextDouble();
        x.b=input.nextDouble();
        x.c=input.nextDouble();

        System.out.println("Enter the measure of triangle Y:");
        y.a=input.nextDouble();
        y.b=input.nextDouble();
        y.c=input.nextDouble();

        double areaX= x.area();
        double areaY=y.area();

        System.out.printf("%nTriangle X area = %.4f",areaX);
        System.out.printf("%nTriangle Y area = %.4f%n",areaY);

        if (areaX>areaY){
            System.out.println("Larger area : X");
        }
        else {
            System.out.println("Larger area : Y.");
        }

        input.close();

    }
}
