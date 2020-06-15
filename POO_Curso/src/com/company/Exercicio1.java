package com.company;

import entities.Rectangle;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input= new Scanner(System.in);

        Rectangle rectangle = new Rectangle();// Chamando a classe.
        System.out.println("Digite o largura e o comprimento do retangulo: ");
        rectangle.largura=input.nextDouble();
        rectangle.comprimento=input.nextDouble();

        double area=rectangle.area();// Chamando um metodo
        double perimetro=rectangle.perimetro();
        double diagonal=rectangle.diagonal();



        System.out.printf("AREA = %.2f%n",area);
        System.out.printf("PERIMETRO = %.2f%n",perimetro);
        System.out.printf("DIAGONAL = %.2f",diagonal);



        input.close();

    }
}
