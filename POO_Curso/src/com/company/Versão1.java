package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Versão1 {

    public static  final double PI=3.14159;


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input=new Scanner(System.in);

        System.out.print("enter radius: ");
        double radius=input.nextDouble();

        double c= circumferencia(radius);
        double v= volume(radius);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI value: %.2f",PI);

        input.close();
    }
    public static double circumferencia(double radius){
        return 2.0* PI * radius;
    }
    public static double volume(double radius){
        return 4.0*PI*radius*radius*radius/3;
    }
}
