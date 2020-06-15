import java.util.Scanner;

public class ExercicioProposto1 {
    public static void main(String[] args) {

        int soma;

        Scanner input= new Scanner(System.in);

        int parcela1,parcela2;
        parcela1=input.nextInt();
        parcela2=input.nextInt();

        input.close();

        soma=parcela1+parcela2;
        System.out.println("SOMA = "+soma);
    }
}
