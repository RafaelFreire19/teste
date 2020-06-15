import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int escolha, quantidade;
        double valor,total;

        valor=0;

        Scanner input = new Scanner(System.in);

        escolha=input.nextInt();
        quantidade=input.nextInt();
        if(escolha==1){
            valor=4;
        }
        if(escolha==2){
            valor=4.5;
        }
        if (escolha==3){
            valor=5;{

            }
        }
        if (escolha==4){
            valor=2;
        }
        if (escolha==5){
            valor=1.5;
        }

        total=valor*quantidade;

        System.out.printf("Total = R$ %.2f",total);

        input.close();

    }
}
