import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        int valor;


        Scanner input = new Scanner(System.in);

        valor=input.nextInt();


        if (valor%2==0){
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        input.close();
    }
}
