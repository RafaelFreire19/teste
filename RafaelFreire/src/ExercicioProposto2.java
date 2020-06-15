import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double areaDoCirculo,valorDePi;

        valorDePi=3.14159;

        Scanner input = new Scanner(System.in);

        double raio;

        raio=input.nextDouble();

        input.close();

        raio= Math.pow(raio,2);
        areaDoCirculo=valorDePi*raio;

        System.out.printf("A=%.4f",areaDoCirculo);
    }
}
