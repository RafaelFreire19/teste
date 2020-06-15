import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        int alcool =0;
        int gasolina=0;
        int disel=0;

        Scanner input = new Scanner(System.in);

        int numero =0;

        while(numero!=4){
            if(numero<1 && numero>4){
                numero=input.nextInt();
            }
            else if (numero==1){
                alcool+=1;
            }
            else if (numero==2){
                gasolina+=1;
            }
            else if (numero==3){
                disel+=1;
            }
            numero=input.nextInt();
            }
        input.close();
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool="+alcool);
        System.out.println("Gasolina="+gasolina);
        System.out.println("Disel="+disel);
        }

    }

