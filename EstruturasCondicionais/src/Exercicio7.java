import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double valorDeX,valorDeY;

        Scanner input= new Scanner(System.in);

        valorDeX=input.nextDouble();
        valorDeY=input.nextDouble();

        if (valorDeX>0 && valorDeY>0){
            System.out.println("Q1");
        }
        else if (valorDeX>0 && valorDeY<0){
            System.out.println("Q4");
        }
        else if (valorDeX<0 && valorDeY>0){
            System.out.println("Q2");
        }
        else if (valorDeX<0 && valorDeY<0){
            System.out.println("Q3");
        }
        else if(valorDeX==0 && valorDeY !=0) {
            System.out.println("EIXO X");
        }
        else if (valorDeX != 0 && valorDeY==0){
            System.out.println("EIXO Y");
        }
        else {
            System.out.println("ORIGEM");
        }
        input.close();
    }
}
