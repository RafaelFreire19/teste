package com.company;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input= new Scanner(System.in);

        Student student=new Student();

        student.name=input.nextLine();
        student.nota1=input.nextDouble();
        student.nota2=input.nextDouble();
        student.nota3=input.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n",student.media());
        System.out.println(student.result());

        input.close();

    }
}
