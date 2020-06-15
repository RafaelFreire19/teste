package com.company;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input= new Scanner(System.in);

        Product product=new Product() ;
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name=input.nextLine();
        System.out.print("Price: ");
        product.price=input.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantily=input.nextInt();

        System.out.println("Product data :"+product);
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity=input.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Update data: "+product);
        System.out.println();
        System.out.print("Enter the number of products to de remove from stock: ");
        int quantily=input.nextInt();
        product.removeProducts(quantily);
        System.out.println();
        System.out.println("Update data: "+product);

        input.close();
    }
}
