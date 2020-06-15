import java.util.Locale;
import java.util.Scanner;
public class Exercicio4_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int numeroFuncionario;
        double numeroHora,valorSalario, valorHora;

        Scanner input = new Scanner(System.in);

        numeroFuncionario = input.nextInt();
        numeroHora = input.nextDouble();
        valorHora = input.nextDouble();

        input.close();

        valorSalario=valorHora*numeroHora;



        System.out.println("NUMBER = "+numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f ",valorSalario);

    }
}