package com.company;

import entities.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class Versao2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input=new Scanner(System.in);
        Calculator calc =new Calculator();

        System.out.print("enter radius: ");
        double radius=input.nextDouble();

        double c= calc.circumferencia(radius);
        double v= calc.volume(radius);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI value: %.2f",calc.PI);



        input.close();
    }
}
