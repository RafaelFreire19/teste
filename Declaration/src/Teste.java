import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);

        System.out.print("How many times do u want see the message?");
        int n =input.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("LOVE U, CALM DOWN, MY LOVE");
        }


      input.close();
    }
}
