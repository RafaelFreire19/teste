import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        int in=0;
        int out=0;
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            int x=input.nextInt();
            if(x>=10 && x<=20){
                in+=1;
            }
            else {
                out+=1;
            }
        }
        System.out.println(in+"in");
        System.out.println(out +"out");

        input.close();
    }
}
