import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int valorDeA,valorDeB,div;

        Scanner input = new Scanner(System.in);
        valorDeA=input.nextInt();
        valorDeB=input.nextInt();

        if (valorDeA>valorDeB){
            if (valorDeA%valorDeB==0){
                System.out.println("multiplos");
            }
            else {
                System.out.println("não multiplos");
            }

        }
        if (valorDeB>valorDeA){
            if (valorDeB%valorDeA==0) {
                System.out.println("multiplos");
            }
            else {
                System.out.println("não multiplos");
            }
        }
        input.close();

    }
}
