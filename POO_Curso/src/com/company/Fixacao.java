package com.company;

import entities.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Fixacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input= new Scanner(System.in);

        System.out.print("What is the price dolar? ");
        double precoDodolar=input.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double valorDeDolares=input.nextDouble();

        double calc =CurrencyConverter.conversor(precoDodolar,valorDeDolares);//Chamada direta da classe, sem ojeto
        double tot=CurrencyConverter.total(precoDodolar,valorDeDolares);

        System.out.printf("Amout to be paid in reais= %.2f%n", tot);
        System.out.println(calc);

        input.close();
    }
}
