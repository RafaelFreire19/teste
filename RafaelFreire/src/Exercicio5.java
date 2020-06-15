import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int numeroPeca1,quantidadePeca1,numeroPeca2,quantidadePeca2;
        double valorPeca1, valorPeca2, valorTotal;
        Scanner input = new Scanner(System.in);

        numeroPeca1= input.nextInt();
        quantidadePeca1=input.nextInt();
        valorPeca1=input.nextDouble();


        numeroPeca2=input.nextInt();
        quantidadePeca2=input.nextInt();
        valorPeca2=input.nextDouble();
        input.close();

        valorTotal=(valorPeca1*quantidadePeca1)+(valorPeca2*quantidadePeca2);

        System.out.printf("VALOR A PAGAR = R$ %.2f",valorTotal);


    }
}
