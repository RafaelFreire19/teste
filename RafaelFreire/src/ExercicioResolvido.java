import java.util.Locale;
import java.util.Scanner;
public class ExercicioResolvido {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double area,valorDeVenda;

        Scanner input =new Scanner(System.in);


        double largura = input.nextDouble();
        double comprimento=input.nextDouble();
        double valorDoMetro=input.nextDouble();

        input.close();

        area=largura*comprimento;
        valorDeVenda=area*valorDoMetro;
        System.out.printf("AREA =  %.2f", area);
        System.out.printf("%nPRECO = %.2f", valorDeVenda);


    }
}
