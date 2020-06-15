import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        double div = 0;
        Scanner input=new Scanner(System.in);

        int n = input.nextInt();

        for(int i=0;i<n;i++){
            int a=input.nextInt();
            int b=input.nextInt();
            if (b==0){
                System.out.println("divisão impossivel");
            }
            else{
                div=(double)a/b;
                System.out.println(div);
            }

        }

        input.close();
    }
}
