import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int horaInicial, horaFinal, duracao;

        Scanner input = new Scanner(System.in);

        horaInicial=input.nextInt();
        horaFinal=input.nextInt();

        if(horaFinal>horaInicial){
            duracao= horaFinal-horaInicial;
        }
        else {
            duracao = (24 - horaInicial + horaFinal);
        }
        System.out.println("O JOGO DUROU " +duracao+" HORA(S)");

        input.close();


    }
}
