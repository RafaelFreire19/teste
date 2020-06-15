package com.company;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Employee employee= new Employee();//Chamada da classe.
        System.out.print("Name: ");
        employee.name=input.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary=input.nextDouble();
        System.out.print("tax: ");
        employee.tax=input.nextDouble();

        System.out.println("Employee: "+employee);
        System.out.println();
        System.out.print("Which percentage o increase salary? Jo");
        employee.increaseSalary(input.nextDouble());
        System.out.println();
        System.out.println("Employee: "+employee);

        input.close();
    }
}
