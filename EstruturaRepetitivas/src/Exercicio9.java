import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int fat=1;
        Scanner input=new Scanner(System.in);
        int n =input.nextInt();

        for(int i = 1;i<n;i++){
            if(n==0){
                System.out.println(1);
            }
            else{
                fat*=(i+1);
            }

        }
        System.out.println(fat);

        input.close();
    }
}

