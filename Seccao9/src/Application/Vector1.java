package Application;

import Utilites.Products;

import java.util.Locale;
import java.util.Scanner;

public class Vector1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input= new Scanner(System.in);

        int n=input.nextInt();
        Products[] vect=new Products[n];
        for(int i=0;i<n;i++){
           input.nextLine();
            String name=input.nextLine();
            double price=input.nextDouble();
            vect[i]=new Products(name, price);
        }
        int sum=0;

        for(int i=0;i<n;i++){

            sum+=vect[i].getPrice();
        }
        double media= sum/n;
        System.out.printf("Média dos produtos: %.2f",media);

        input.close();
    }
}
