import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int senha= 0;

        while (senha != 2002){
            System.out.println("senha invalida");
            senha=input.nextInt();
        }

            System.out.println("acesso permitido");

        input.close();

    }
}
