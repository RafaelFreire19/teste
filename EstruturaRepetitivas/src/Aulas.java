import java.util.Locale;
import java.util.Scanner;

public class Aulas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input= new Scanner(System.in);
        System.out.println("digite 3 números: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();


        int higher = max(a,b,c);
        
        showResult(higher);

    }
    public static int max (int x,int y, int z){
        int aux;
        if (x>y && x>z){
            aux=x;
        }
        else if(y>x && y>z){
            aux=y;
        }
        else {
            aux=z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = "+value);
    }


}

