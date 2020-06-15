package com.company;

import entities.Calculator2;

import java.util.Locale;
import java.util.Scanner;

public class versão3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input=new Scanner(System.in);

        System.out.print("enter radius: ");
        double radius=input.nextDouble();

        double c= Calculator2.circumferencia(radius);
        double v= Calculator2.volume(radius);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI value: %.2f",Calculator2.PI);



        input.close();
    }
}
