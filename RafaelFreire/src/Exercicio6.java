import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double valorDeA, valorDeB,valorDeC,valorDePi;
        double areaDoTriangulo,areaDoCirculo,areaDoTrapezio,areaDoQuadrado,areaDoRetangulo;

        valorDePi=3.14159;


        Scanner input = new Scanner(System.in);

        valorDeA=input.nextDouble();
        valorDeB=input.nextDouble();
        valorDeC=input.nextDouble();

        input.close();

        areaDoTriangulo=(valorDeA*valorDeC)/2;
        areaDoCirculo=valorDePi* (Math.pow(valorDeC,2));
        areaDoTrapezio= ((valorDeA+valorDeB)/2)*valorDeC;
        areaDoQuadrado=Math.pow(valorDeB,2);
        areaDoRetangulo=valorDeA*valorDeB;

        System.out.printf("TRIANGULO = %.3f", areaDoTriangulo);
        System.out.printf("%nCIRCULO = %.3f", areaDoCirculo);
        System.out.printf("%nTRAPEZIO = %.3f",areaDoTrapezio);
        System.out.printf("%nQUADRADO = %.3f",areaDoQuadrado);
        System.out.printf("%nRETANGULO = %.3f",areaDoRetangulo);
    }
}
