import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        int a,b,c,d,diferenca;

        Scanner input= new Scanner(System.in);

        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();

        input.close();

        diferenca=(a*b)-(c*d);

        System.out.println("DIFERENCA = "+diferenca);


    }
}
