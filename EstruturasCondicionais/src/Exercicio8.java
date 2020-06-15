import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double valorDoSalario,valorDoImposto1, valorDoImposto2,valorDoImposto3, valorTotal, valorPacial;

        Scanner input = new Scanner(System.in);

        valorDoSalario=input.nextDouble();

        if (valorDoSalario>=0 && valorDoSalario<=2000){
            System.out.println("ISENTO");
        }
        else if(valorDoSalario>2000 && valorDoSalario<=3000){
            valorTotal=(valorDoSalario-2000)*8/100;
            System.out.printf("R$ = %.2f",valorTotal);
        }
        else if (valorDoSalario>3000 && valorDoSalario<=4500){
            valorPacial=valorDoSalario-3000;
            valorDoImposto1=1000*8/100;
            valorDoImposto2=valorPacial*18/100;
            valorTotal=valorDoImposto1+valorDoImposto2;
            System.out.println(valorTotal);
        }
        else {
            valorPacial=valorDoSalario-4500;
            valorDoImposto1=1000*8/100;
            valorDoImposto2=1500*18/100;
            valorDoImposto3=valorPacial*28/100;
            valorTotal=valorDoImposto1+valorDoImposto2+valorDoImposto3;
            System.out.printf("R$ = %.2f",valorTotal);
        }
        input.close();
    }
}
