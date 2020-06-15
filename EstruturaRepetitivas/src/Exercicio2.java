import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int valorDex=input.nextInt();
        int valorDeY=input.nextInt();

        while (valorDex!=0 && valorDeY!=0){

            if(valorDex>0 && valorDeY>0){
                System.out.println("Primeiro");
            }
            else if (valorDex>0 && valorDeY<0){
                System.out.println("quarto");
            }
            else if (valorDex<0 && valorDeY>0){
                System.out.println("segundo");
            }
            else if (valorDex<0 && valorDeY<0){
                System.out.println("terceiro");
            }
            valorDex=input.nextInt();
            valorDeY=input.nextInt();
        }
        input.close();
    }
}
