package Application;

import Utilites.Rents;

import java.util.Locale;
import java.util.Scanner;

public class Rooms {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Rents rents;
        Scanner input= new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = input.nextInt();
        input.nextLine();
        Rents[] vect=new Rents[10];
        for(int i=1; i<=n;i++){
            System.out.println("Rent #"+i+":");
            System.out.print("Name: ");
            String name=input.nextLine();
            System.out.print("email: ");
            String email=input.nextLine();
            System.out.print("Room:");
            int room=input.nextInt();
            input.nextLine();
            vect[room]=new Rents(name,email);
        }
        System.out.println();
        System.out.println("Buys rooms: ");
        for (int i=0;i<vect.length;i++){
            if (vect[i]!=null){
                System.out.println(i+": "+vect[i]);
            }
        }




        input.close();
    }
}
