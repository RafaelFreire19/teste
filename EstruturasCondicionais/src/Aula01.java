import java.util.Locale;
import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        ;

        Scanner input= new Scanner(System.in);
        int x=input.nextInt();
        String dia;

        switch (x){
            case 1: dia="Domingo";
                    break;
            case 2: dia="segunda";
                    break;
            case 3: dia="terça";
                    break;
            case 4: dia="Quarta";
                    break;
            case 5: dia="Quinta";
                    break;
            case 6: dia="sexta";
                    break;
            case 7: dia= "sabado";
                    break;
            default:
                dia="valor invalido";
                        break;
        }
        System.out.println("DIA DA SEMANA : "+dia);




        input.close();


    }
}
