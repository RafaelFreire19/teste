import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int valor;

        Scanner input = new Scanner(System.in);

        valor=input.nextInt();
        if (valor<0){
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NAO NEGATIVO");
        }

        input.close();
    }
}
