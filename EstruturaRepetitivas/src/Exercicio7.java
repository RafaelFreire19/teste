import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double media=0;
        Scanner input=new Scanner(System.in);

        int n =input.nextInt();

        for (int i=0;i<n;i++){
            double a=input.nextDouble();
            double b=input.nextDouble();
            double c=input.nextDouble();
            media=(a*2+b*3+c*5)/10;
            System.out.printf("%.1f",media);
            }
        input.close();



    }

    }


