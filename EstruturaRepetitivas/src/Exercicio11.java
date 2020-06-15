import java.util.Scanner;


public class Exercicio11 {
    public static void main(String[] args) {
        int quad=0;
        int cub=0;

        Scanner input = new Scanner(System.in);

        int n =input.nextInt();

        for(int i=1;i<=n;i++){
          quad= (int) Math.pow(i,2);
          cub=(int) Math.pow(i,3);
            System.out.print(i+" " );
            System.out.print(quad+" ");
            System.out.println(cub);
        }


        input.close();
    }
}
