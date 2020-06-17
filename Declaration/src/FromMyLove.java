import java.util.Scanner;

public class FromMyLove {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("How many times u want to hear, i love u? ");
        int n=input.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("I love u, my princess");
        }

        input.close();
    }
}
