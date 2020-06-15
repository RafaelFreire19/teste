package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input=new Scanner(System.in);

        double xA,xB,xC,yA,yB,yC;
        System.out.println("Enter the measure of triangle x: ");
        xA=input.nextDouble();
        xB=input.nextDouble();
        xC=input.nextDouble();

        System.out.println("Enter the measure of triangle y: ");

        yA=input.nextDouble();
        yB=input.nextDouble();
        yC=input.nextDouble();

        double pX=(xA+xB+xC)/2.0;
        double areaX= Math.sqrt(pX*(pX-xA)*(pX-xB)*(pX-xC));

        double pY=(yA+yB+yC)/2.0;
        double areaY= Math.sqrt(pY*(pY-yA)*(pY-yB)*(pY-yC));

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
